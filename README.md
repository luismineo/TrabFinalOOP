# Trabalho Final de Orientação a Objetos
Programa que simula um centro de atendimento à pacientes humanos e a animais, permitindo gerenciar funcionários e pacientes, além de uma função para calcular dosagem de alguns rémedios, tanto para humanos quanto animais

### Exemplo de modificadores e encapsulamento
[![screenchot](https://raw.githubusercontent.com/luismineo/TrabFinalOOP/main/src/imgs/mod_encp.png)]
Modificadores **private** para que os parâmetros sejam acessados somente dentro da classe, e conjunto de **get** e **set*, demonstrando o conceito de encapsulamento, para que os parâmetros sejam acessados e modificados fora da classe

### Exemplo de herança
[![screenchot](https://raw.githubusercontent.com/luismineo/TrabFinalOOP/main/src/imgs/hertg.png)]
Aqui a classe **gato** herda todas as características da classe **animal**

## Exemplo de polimorfismo
[![screenchot](https://raw.githubusercontent.com/luismineo/TrabFinalOOP/main/src/imgs/polimorfismo.png)]
Aqui temos um método chamado **calculateDosage** onde o mesmo recebe como parâmetro um objeto do tipo **Animal**. No código, neste método, serão passados tanto objetos do tipo **Dog** e **Cat**, quanto do tipo **Patient**, portando sendo um exemplo de polimorfismo. Já que estas classes herdam de **Animal**, elas podem ser passadas como parâmetro para o método.
