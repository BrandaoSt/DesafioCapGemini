# DesafioCapgemini
Processo seletivo Capgemini 2022 - Desafio Java <br />

Instruções de como rodar a aplicação <br />

1- Acessar a branch "master" deste reposítório clicando em "2 branches"; <br />
2- Copiar o código de cada questão;<br />
3- Acessar o compilador Java online através deste endereço:  https://www.jdoodle.com/online-java-compiler/<br />
4- Colar o código na área de desenvolvimento;<br />
5- Ativar o botão "Interactive";<br />
6- Iniciar a compilação clicando em "Execute";<br />
7- Verificar o console e se necessário, interagir com a aplicação.<br />
 
ATENÇÂO: Caso ocorra erro 404 na página do github, acessar a branch master pelo seguinte link: https://github.com/BrandaoSt/DesafioCapgemini/tree/master <br />

#QUESTÕES

#Questão 01<br /><br />

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.<br />
Exemplo:<br />
Entrada:<br />
n = 6<br />


Saída:<br />
          *<br />
        **<br />
      ***<br />
    ****<br />
  *****<br />
******<br />


# Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:<br /><br />
Possui no mínimo 6 caracteres.<br />
Contém no mínimo 1 digito.<br />
Contém no mínimo 1 letra em minúsculo.<br />
Contém no mínimo 1 letra em maiúsculo.<br />
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+<br /><br />

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.<br /><br />

Exemplo:<br /><br />
Entrada:<br />
Ya3<br /><br /><br />


Saída:<br />
3<br />


Explicação:<br />
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.<br /><br /><br />


# Questão 03<br /><br />

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.<br /><br />

Exemplo:<br />

Exemplo 1)<br />

Entrada:<br />

ovo<br />


Saída:<br />
2<br /><br />


Explicação:<br />
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. <br />

Exemplo 2)<br />

Entrada:<br />
ifailuhkqq<br />


Saída:<br />
3<br />


Explicação:<br />
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].<br />


