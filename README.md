# AppMusica em Java
## Aplicando conceitos de POO.

Este é um projeto simples desenvolvido em Java que simula um reprodutor de mídias. Ele permite reproduzir músicas e podcasts, e favoritar as mídias com base na interação do usuário.
O projeto segue boas práticas de organização de pacotes e separação por classes. Ele está localizado dentro de:
### Classes Principais
| Classe   | Descrição |
|----------|-----------|
| Audio  | Classe base com atributos e métodos comuns para mídias (título, duração, autor, curtidas etc). |
| Musica | Subclasse de Audio que representa uma música com atributo adicional gênero e álbum. |
| Podcast| Subclasse de Audio que representa um podcast com atributos como descrição e episódio. |

## Funcionalidades

- Reproduzir músicas e podcasts.
- Exibir informações das mídias.
- Interagir com o usuário para saber se ele deseja favoritar uma mídia.
- Armazenar e exibir uma lista de mídias favoritas.
  
## Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git Bash 

## Exemplo de Uso

Ao rodar a aplicação, o usuário será perguntado se deseja favoritar cada mídia:

```
Mídia Hotline Bling sendo reproduzida
Duração: 4.27
Você deseja favoritar esta mídia? (S/N)
s
Esta música foi favoritada.

Mídia BolhaDev sendo reproduzida
Duração: 30.0
Você deseja favoritar esta mídia? (S/N)
n
Este podcast não foi favoritado.

Minhas mídias favoritas: 
- Hotline Bling de Drake

```
