# desafioOOJava

``` mermaid
classDiagram
  class ReprodutorMusical {
    - volume: int
    + tocar()
    + pausar()
    + selecionarMusica(musica: String)
  }

  class AparelhoTelefonico {
    - numero: String
    + ligar()
    + atender()
    + iniciarCorreioVoz()
  }

  class NavegadorInternet {
    - paginaAtual: String
    + exibirPagina(url: String)
    + adicionarNovaAba()
    + atualizarPagina()
  }

  class IPhone {
    - volume: int
    - numero: String
    - paginaAtual: String
    + tocar()
    + pausar()
    + selecionarMusica(musica: String)
    + ligar()
    + atender()
    + iniciarCorreioVoz()
    + exibirPagina(url: String)
    + adicionarNovaAba()
    + atualizarPagina()
  }

  ReprodutorMusical --|> IPhone
  AparelhoTelefonico --|> IPhone
  NavegadorInternet --|> IPhone
```
