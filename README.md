# Бот, который цитирует присланный ему текст -  интеграция с BotAPI VK. https://vk.com/dev/bots_docs

### Пример работы

![](https://github.com/aleksandra0KR/VKBot/blob/master/examplepicture/1.png?raw=true)

## Как запустить:

 ### Склонировать проект с гита

```
git clone https://github.com/aleksandra0KR/VKBot
```


### Чтобы использовать внешний https адрес для локальной машины можете воспользоваться ngrok
- установаите ngrok
- ngrok http http://localhost:8080 (если хотите использвать другой порт измените его в этом адрессе и в application.properties)

### Настроить vkCallback.properties :

- Открыть VKBot/src/main/resources/vkCallback.properties
- Указать ваши параметры из ВК

Описание параметров :
> | В   vkCallback.properties | Что это                               |
> |---------------------------|---------------------------------------|
> | vk.api.access-token       | Кключ доступа                         |
> | vk.api.v                  | Версия API                            |
> | vk.api.secret             | Секретный ключ                        |
> | vk.api.confirmation       | Строка, которую должен вернуть сервер |


### Запустите приложение
