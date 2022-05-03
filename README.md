# Accouning. Финансовый учет

Учебный проект
курса [Kotlin Backend Developer](https://otus.ru/lessons/kotlin/?int_source=courses_catalog&int_term=programming).
Accounting -- это сервис финансового учета, задача которого заключается в предоставлении пользователю возможности
контроля за своими доходами и расходами.

## Учебный маркетинг приложения

Считаем, что целевая аудитория учебного сервиса -- это частные лица, желающие автоматизировать свой финансовый учет.

### Гипотетический портрет пользователя

1. Лица со средним или высшим образованием.
2. Женщины и мужчины от 18 до 60 лет.
3. Лица, имеющие базовое представление о сути финансового учета и желающие контролировать свои финансы.
4. Наемные работники либо индивидуальные предприниматели.

## Описание MVP

### Функции (эндпониты)

1. CRUDS (create, read, update, delete, search) для следующих сущностей

- пользователей (User)
- ролей (Role)
- транзакций (Transaction)
- счетов (Account)
- категорий (Category)

2. CRUD для планируемых и фактических показателей расходов / доходов
3. Настройки уведомлений о платежах
4. Методы для получения аналитики

### Опциональный функционал

- интеграция с telegram-ботом
- рассылка отчетов по тратам
- RnD tinkoff api

### Описание сущности User

1. UserId
2. FirstName
3. MiddleName
4. LastName
5. BirthDate
6. Email
7. PhoneNumber
8. AccountList
9. RoleId

### Описание сущности Role

1. RoleId
2. Title
3. PermissionList

### Описание сущности Transaction

1. TransactionId
2. DateTime
3. CategoryType
4. AccountIdFrom
5. AccountIdTo
6. Amount
7. Currency (Ruble, Dollar, Euro)
8. TransactionType (Withdrawal, Payment, Refill)

### Описание сущности Account

1. ContractId
2. OwnerName
3. AccountNumber
4. BIC
5. RecipientBankId
6. CorrespondentAccountNumber
7. INN
8. Currency

### Описание сущности Category

1. CategoryId
2. Title
3. Description

# Структура проекта

## Транспортные модели, API

1. [specs](specs) - описание API в форме OpenAPI-спецификаций
2. [accounting-api-kmp](accounting-api-kmp) - Генерация второй версии транспортных моделей с KMP
3. [accounting-common](accounting-common) - Модуль с общими классами для модулей проекта. В частности, там располагаются
   внутренние модели и контекст.
4. [accounting-api-kmp-mapper](accounting-api-kmp-mapper) - Маппер между [внутренними моделями](accounting-common)
   и [моделями API](accounting-api-kmp)

## Фреймворки и транспорты

## Модули бизнес-логики

## Хранение, репозитории, базы данных
