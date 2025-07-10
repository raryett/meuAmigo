# Meu Amigo

![Java Badge](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white) ![Maven Badge](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

Este é um projeto simples desenvolvido em Java, com foco em exemplos básicos de interação e manipulação de dados. Ele serve como uma base para demonstrar funcionalidades essenciais da linguagem e pode ser utilizado como ponto de partida para estudos ou protótipos.

---

## 🚀 Começando

Para clonar e executar este projeto em sua máquina local, siga os passos abaixo:

### Pré-requisitos

Certifique-se de ter os seguintes softwares instalados:

* **Java Development Kit (JDK)**: Versão 17 ou superior. Você pode baixar em [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) ou [Open JDK](https://openjdk.org/install/).
* **Git**: Para clonar o repositório. Você pode baixar em [git-scm.com](https://git-scm.com/downloads).
* **Apache Maven**: Para gerenciar as dependências e construir o projeto. Baixe em [maven.apache.org/download.cgi](https://maven.apache.org/download.cgi).

### Instalação e Execução

1.  **Clone o repositório:**

    ```bash
    git clone [https://github.com/raryett/meuAmigo.git](https://github.com/raryett/meuAmigo.git)
    ```

2.  **Navegue até o diretório do projeto:**

    ```bash
    cd meuAmigo
    ```

3.  **Compile e execute o projeto com Maven:**

    ```bash
    mvn clean install
    mvn exec:java -Dexec.mainClass="Main"
    ```
    * **Observação:** Certifique-se de que sua classe principal (`Main`) está no pacote correto e que o `pom.xml` está configurado para executar essa classe. Se `Main` estiver em um pacote como `com.seuprojeto`, o comando seria `mvn exec:java -Dexec.mainClass="com.seuprojeto.Main"`.

---

## 🛠️ Tecnologias Utilizadas

* **Java**: Linguagem de programação principal.
* **Apache Maven**: Sistema de automação de build e gerenciamento de dependências.

---

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Se você tiver sugestões, melhorias ou encontrar algum bug, sinta-se à vontade para:

1.  Fazer um **fork** do repositório.
2.  Criar uma nova **branch** (`git checkout -b feature/minha-feature`).
3.  Fazer suas **alterações** e commitar (`git commit -m 'feat: minha nova feature'`).
4.  Fazer **push** para a branch (`git push origin feature/minha-feature`).
5.  Abrir um **Pull Request**.

---

## ✍️ Autor

* **Rary** - [GitHub Profile](https://github.com/raryett)

---

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

