# Exercício de Manipulação de Conjuntos em Java

Este projeto Java tem como objetivo praticar conceitos de `Set`, `List`, `LinkedHashSet`, ordenações com `Comparator` e `Comparable`, além de operações com coleções como ordenação, filtragem, e remoção de elementos.

---

## 🌈 Parte 1: Arco-Íris

### Objetivos:

- Exibir todas as cores do arco-íris, uma abaixo da outra.
- Exibir a quantidade de cores.
- Exibir as cores em ordem alfabética.
- Exibir as cores na ordem inversa da inserção.
- Exibir cores que começam com a letra **V**.
- Remover cores que **não** começam com a letra **V**.
- Limpar o conjunto de cores.
- Verificar se o conjunto está vazio.

---

## 💻 Parte 2: Linguagens Favoritas

### Objetivos:

- Criar uma coleção com 3 linguagens de programação contendo:
  - Nome
  - Ano de criação
  - IDE favorita

### Ordenações implementadas:

- ✅ Ordem de Inserção  
- ✅ Ordem Natural (por nome usando `compareToIgnoreCase()`)
- ✅ Ordem por IDE (usando `ComparatorIde`)
- ✅ Ordem por Ano de Criação e Nome (usando `ComparatorAnoDeCriacaoNome`)
- ✅ Ordem por Nome, Ano e IDE (usando `ComparatorNomeAnoDeCriacaoIde`)

---

## 🛠️ Tecnologias utilizadas

- Java 17+
- IDE de sua preferência (IntelliJ, VSCode, Eclipse)
- `java.util.Set`, `java.util.List`, `java.util.LinkedHashSet`, `Collections`, `Comparator`, `Comparable`

---
## 📁 Estrutura de pastas

📦 ExercicioCollections
 ┃
 ┣ 📂 ExercicioCollections      
 ┃ ┣ 📜 ExerciciosProposto.java
 ┃ ┃
 ┣ 📜 README.md                 
 ┗ 📜 .gitignore


yaml
Copiar
Editar

---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/ExercicioCollections.git
Abra no VSCode ou outra IDE.

Compile e execute a classe ExerciciosProposto.java.

## 📚 Conceitos praticados
Programação Orientada a Objetos (POO)

Ordenação de listas

Manipulação de conjuntos (Set)

Boas práticas com Comparable e Comparator

Uso de estruturas imutáveis e ordenadas (LinkedHashSet, ArrayList)