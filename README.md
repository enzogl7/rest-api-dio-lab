# Santander Dev Week 2023
Rest API criada para o Dio LAB

## Diagrama de classes 

```mermaid
classDiagram
    class User {
        +String name
    }

    class Account {
        +String number
        +String agency
        +String balance
        +float limit
    }

    class Card {
        +String number
        +float limit
    }

    class Feature {
        +String icon
        +String description
    }

    class News {
        +String icon
        +String description
    }

    User "1" *-- "1" Account : has
    User "1" *-- "1" Card : has
    User "1" *-- "N*" Feature : has
    User "1" *-- "N" News : has
