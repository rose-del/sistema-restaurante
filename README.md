# Sistema de Pedidos de Restaurante 🍔

Este projeto é um sistema simples de pedidos de restaurante utilizando Programação Orientada a Objetos (POO) em Java. 
Ele permite que clientes escolham itens do cardápio, façam pedidos e calculem o valor total, incluindo impostos.

## Funcionalidades

✅ Escolha de itens do cardápio <br>
✅ Cálculo automático do valor total do pedido <br>
✅ Registro e cálculo de imposto via Receita Federal

## Estrutura do Projeto
O sistema possui as seguintes classes principais:
  - Item → Representa um item do cardápio (nome e preço).
  - Cliente → Representa um cliente que faz pedidos.
  - Pedido → Contém os itens escolhidos pelo cliente e calcula o valor total do pedido.
  - ReceitaFederal → Registra e calcula os impostos sobre os pedidos.
  - Main → Gerencia a interação com o usuário

## Como Executar

### 1. Clone o repositório:
```bash
git clone https://github.com/rose-del/sistema-restaurante
```

### 2. Navegue até a pasta do projeto:
```bash
cd sistema-restaurante
```

### 3. Compile os arquivos Java:
```bash
javac *.java
```

### 4. Execute o programa:
```bash
java Main
```

## Melhorias Futuras
- Criar interface gráfica (GUI) para facilitar o uso

- Implementar persistência de dados com banco de dados

