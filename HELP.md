# Тестовое задание для ИВЦ Минфина

### Приложение справочник банков.

### Для запуска нужно:

1. Запускаем консоль из папки с pom.xml и выполняем команды:
- psql --username=postgres --file=db/create-db.sql
- mvn package
2. Копируем war-файл из папки target в папку \<TOMCAT_HOME\>/webapps
3. Запускаем сервер томкат
4. Web-приложение будет доступно из браузера по адресу: http://localhost:8080/MinFinTest-0.0.1-SNAPSHOT
5. Логин и пароль: user password