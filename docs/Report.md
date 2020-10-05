# Отчет по итогам автоматизации:
----
Было запланировано автоматизировать тестирование приложения для покупки тура по нескольким сценариям. Автоматизация была успешно проведена, все намеченное выполнено. Все запланированные инструменты использовались. Касательно инструментов, в меньшей степени, чем было запланировано, использовался генератор данных Faker, нужны были, в основном, цифровые данные, для этого использовался класс Random

## Сработавшие риски:
- возникли трудности при поиске среди одинаковых элементов на странице
- из-за комплексного характера тестирования, не все тесты получилось корректно настроить для работы с БД
- сложность при передаче параметров через командную строку, и в работе с properties

## Общий итог по времени:
- Настройка потребовала вдвое меньше времени, чем было запланировано,несмотря на сложности с контейнеризацией. Закладывалось время на риски, связанные с технической сложностью настройки, учитывая, что нужно было развернуть 2 базы данных, разобраться как они будут работать с платежной системой
- Разработка заняла больше времени, чем было запланировано
- На создание отчетов затрачено времени в соответствии с планом