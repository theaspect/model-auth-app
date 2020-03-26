# **План R2**
1. Создать файл [Roadmap2.md](Roadmap2.md) в репозитории проекта - R2.1 с описанием плана работ по второму набору требований
2. Обновить файл [README.md](../README.md)
    1. Описание проекта — R2.2
    2. Добавить ссылки на Roadmap1 и Roadmap2 — R2.2
    3. Инструкцию по сборке `jar` проекта — R2.3
    4. Инструкцию по запуску проекта в виде консольных команд — R2.4
    5. Инструкцию по тестированию собранного проекта — R2.5
3. Создать папку `scripts`
    1. Добавить скрипт сборки проекта ([BUILD.sh](../scripts/BUILD.sh)) — R2.6
    2. Добавить скрипт запуска проекта ([RUN.sh](../scripts/RUN.sh)) — R2.7
    3. Добавить скрипт теста проекта ([TEST.sh](../scripts/TEST.sh)) — R2.8
    4. Добавить в [TEST.sh](../scripts/TEST.sh) коды возврата
    (код 1, если хотя бы один тест не прошел, 0 — все пройдено) — R2.11
    5. Исправить скрипты сборки и запуска для работы под windows системой: добавить разделитель `;` — R2.6, R2.7
4. Отформатировать код согласно Kotlin Code Convention — R2.9
    1. Изучить содержание требований к [форматированию](https://kotlinlang.org/docs/reference/coding-conventions.html):
        1. Скобки
        2. Нейминг
        3. комментарии
    2. Проверить весь код на соответствие требованиям
    3. Исправить форматирование
5. Проверить описание файла `.gitignore` — R2.10
    1. `.idea` в `.gitignore` 
    2. `*.iml` в `.gitignore`
6. Проверить, что в репозиторий нет [бинарных файлов](https://git-scm.com/docs/git-rm) — R2.10
7. Написать скрипт непрерывной интеграции — R2.12
    1. Изучить работу `travis-ci` файлов
        1. *Как настроить окружение для `kotlin` программы?*
        **Результат**: знаем где и как будет запускаться ci
        2. *Как запускать скрипты?*
        **Результат**: знаем как прописать запуск shell-скриптов
        3. *Как обрабатывать результаты тестов?*
        **Результат**: знаем как у комита статус тестов красный/зеленый поставить
    2. Включить в скрипт шаги
        1. Сборка проекта
        2. Запуск тестов
8. Настроить GitHub Pages для репозитория — R2.13
    1. Изучить [документацию функции](https://help.github.com/en/github/working-with-github-pages)
    2. Выбрать тему для репозитория
    3. Подключить генерацию pages из [README.md](../README.md) ветки master