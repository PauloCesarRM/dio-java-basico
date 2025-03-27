# Controle de Veículos 🚗🏍️

## Descrição da Atividade 📋

2. Escreva um código onde controlamos as funções de um carro. Ele deve ter as seguintes funções:
    - Ligar o carro;
    - Desligar o carro;
    - Acelerar;
    - Diminuir velocidade;
    - Virar para esquerda/direita;
    - Verificar velocidade;
    - Trocar a marcha.

### Regras de Implementação ⚙️

- Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0;
- O carro desligado não pode realizar nenhuma função;
- Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
- Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no mínimo a 0km);
- O carro deve possuir 6 marchas, e não deve ser permitido pular uma marcha no carro;
- A velocidade do carro deve respeitar os seguintes limites para cada marcha:
    - Se o carro estiver na marcha 0 (ponto morto), ele não pode acelerar;
    - Se estiver na 1ª marcha, sua velocidade pode estar entre 0km e 20km;
    - Se estiver na 2ª marcha, sua velocidade pode estar entre 21km e 40km;
    - Se estiver na 3ª marcha, sua velocidade pode estar entre 41km e 60km;
    - Se estiver na 4ª marcha, sua velocidade pode estar entre 61km e 80km;
    - Se estiver na 5ª marcha, sua velocidade pode estar entre 81km e 100km;
    - Se estiver na 6ª marcha, sua velocidade pode estar entre 101km e 120km;
- O carro poderá ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km;
- O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km.

---

## Expansão do Projeto 🚀

Para reforçar conceitos de Programação Orientada a Objetos (POO) e praticar a reutilização de código, o projeto foi expandido com as seguintes melhorias:

- **Criação de uma hierarquia de classes**: A classe `Veiculo` foi criada como base para `Carro` e `Moto`, permitindo melhor organização e reaproveitamento de código;
- **Uso de Polimorfismo**: Métodos como `ligar()` foram sobrescritos para permitir mensagens personalizadas de cada tipo de veículo;
- **Implementação de um Factory**: A criação de veículos foi feita utilizando o padrão Factory, tornando o código mais modular e escalável;
- **Armazenamento de veículos criados**: Agora, os veículos criados são armazenados em uma lista e podem ser acessados posteriormente;
- **Interface interativa**: O usuário pode criar novos veículos ou selecionar um existente para interagir.

---

## Como Executar 🔧

1. Compile e execute a classe `Autodromo.java` no IntelliJ IDEA ou em qualquer IDE compatível com Java;
2. No menu inicial, escolha entre criar um novo veículo ou selecionar um já existente;
3. Após selecionar um veículo, utilize as opções disponíveis para interagir com ele;
4. Para sair, escolha a opção `0 - Sair`.

### Requisitos 📌
- Java 8 ou superior;
- IntelliJ IDEA, Eclipse ou outra IDE compatível com Java.

---

Este projeto faz parte do bootcamp Java Cloud Native do Bradesco, sendo um exercício de reforço em Programação Orientada a Objetos. O foco foi em seguir boas práticas de design e implementação, com a aplicação de conceitos essenciais de POO