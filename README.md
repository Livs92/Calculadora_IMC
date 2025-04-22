# 📱 Calculadora de IMC

Este projeto é um **aplicativo Android**, desenvolvido em **Kotlin**, que calcula o **IMC (Índice de Massa Corporal)** a partir do peso e da altura informados pelo usuário. O app exibe a classificação correspondente ao resultado (baixo peso, normal, sobrepeso, etc.).

---

## 🚀 Tecnologias Utilizadas

- **Kotlin** – Linguagem principal do desenvolvimento.
- **Android Studio** – IDE para desenvolvimento do app.

### Recursos da Interface:

- **Activity** – Gerencia as telas e as interações do usuário.
- **Intent** – Responsável pela navegação entre telas e pela passagem de dados.
- **Snackbar** – Exibe mensagens de validação ou erro ao usuário.
- **screenOrientation** – Define a orientação da tela (retrato/paisagem).

---

## 🧩 Estrutura de Layout

### ViewGroups:
- **LinearLayout** – Organiza componentes em linha (horizontal ou vertical).
- **ConstraintLayout** – Permite posicionar os elementos com mais flexibilidade, utilizando restrições.

### Views:
- **ImageView** – Exibição de ícones e imagens.
- **TextView** – Exibição de textos e resultados.
- **TextInputLayout / TextInputEditText** – Campos para entrada de dados (peso e altura).
- **Button** – Botão para acionar o cálculo do IMC.

---

## 🔧 Lógica e Funcionalidades

- **findViewById** – Realiza a vinculação entre os elementos da interface e o código Kotlin.
- **Estruturas condicionais (`when`, `in.. ->`, `else`)** – Responsáveis por classificar o IMC em diferentes categorias (ex.: abaixo do peso, peso normal, sobrepeso).


