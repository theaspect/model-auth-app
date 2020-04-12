package xyz.sashenka.modelauthapp.dao

import xyz.sashenka.modelauthapp.model.dto.DBAccess
import java.sql.Connection

class ResourceDAO(private val dbConnection: Connection) {
    private val selectUserResourcesByLoginSql: String
        get() = """
                SELECT ACCESS.USER_ID, ACCESS.RESOURCE, ACCESS.ROLE, ACCESS.ID
                FROM ACCESS
                LEFT JOIN USER 
                    ON ACCESS.USER_ID=USER.ID  
                WHERE 
                    USER.LOGIN=? 
                AND ACCESS.RESOURCE=SUBSTRING(?,1,LENGTH(ACCESS.RESOURCE)) 
                AND ACCESS.ROLE=?;
                """

    fun requestAccessByResource(login: String, resource: String, role: String): DBAccess? {
        val statement = dbConnection.prepareStatement(selectUserResourcesByLoginSql)
        statement.setString(1, login)
        statement.setString(2, resource)
        statement.setString(3, role)
        val value = statement.executeQuery()

        val access = when {
            value.next() -> DBAccess(
                id = value.getInt("ID"),
                userId = value.getInt("USER_ID"),
                resource = value.getString("RESOURCE"),
                role = value.getString("ROLE")
            )
            else -> null
        }

        statement.close()
        value.close()
        return access
    }
}
