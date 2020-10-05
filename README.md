# О программе:
Предназначена для автоматизированного тестирования сервиса по покупке тура с помощью дебетовой карты или с получением кредита по данным дебетовой карты
## Документация:
* [План автоматизации тестирования](https://github.com/mind-controled/QA-Diplom/blob/master/docs/TestPlan.md)
* [Отчет по итогам тестирования](https://github.com/mind-controled/QA-Diplom/blob/master/docs/TestReport.md)
* [Отчет по итогам автоматизации](https://github.com/mind-controled/QA-Diplom/blob/master/docs/Report.md)
## Тестовое окружение:
1. **Node.js**
1. **Docker**
1. **Java 11**
1. **IntelliJ IDEA**
1. **Браузер**
1. Свободные порты: **8080; 9999; 5432; 3306**

## Инструкции по установке:
1. Склонировать репозиторий
1. Запустить контейнер, в котором разворачивается База Данных командой: ``docker-compose up -d --force-recreate``
1. Запустить приложение командой:
   * для использования **Postgres:** ``java -Dspring.datasource.url=jdbc:postgresql://localhost:5432/postgres -jar artifacts/aqa-shop.jar``
   * для использования **MySQL:** ``java -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -jar artifacts/aqa-shop.jar``

**Приложение запускается на порту:** ***8080***
## Запуск тестов:
**Запустите тесты командой:**
* При работе с **Postgres:** ``gradlew clean test -Ddb.url=jdbc:postgresql://localhost:5432/postgres -Dlogin=app -Dpassword=pass -Dapp.url=http://localhost:8080``
* При работе с **mySql:** ``gradlew clean test -Ddb.url=jdbc:mysql://localhost:3306/app -Dlogin=app -Dpassword=pass -Dapp.url=http://localhost:8080``
