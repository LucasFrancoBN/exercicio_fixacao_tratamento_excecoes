# Exercício
Projeto desenvolvido para ler os dados de uma conta bancária e, logo após, realizar um saque nessa conta, mostrando o novo saldo. As regras do exercício são:

1. **Não deixar um saque acontecer se:**
   - não houver saldo suficiente na conta.
   - valor do saque for superior ao limite de saque da conta.
2. **Seguir o seguinte diagrama de classe:**
   
   ![Diagrama de classe](https://github.com/LucasFrancoBN/exercicio_fixacao_tratamento_excecoes/blob/master/img/diagrama_classe.png)
    

## Exemplo
```plaintext
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 100.00
New balance: 400.00
```
```plaintext
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 400.00
Withdraw error: The amount exceeds withdraw limit
```
```plaintext
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 800.00
Withdraw error: The amount exceeds withdraw limit
```
```plaintext
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 200.00
Withdraw limit: 300.00

Enter amount for withdraw: 250.00
Withdraw error: Not enough balance
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/exercicio_fixacao_tratamento_excecoes.git

# Acesse o diretório da classe Program
cd exercicio_fixacao_tratamento_excecoes/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../model/entities/Account.java ../model/exceptions/DomainException.java
```
Retroceda ao diretório src e compile o programa
```
# Retroceda ao diretório src
cd ../

# Execute o programa
java application.Program
```
