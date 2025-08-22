# Exercício 1

## Enunciado
Explique a diferença entre o uso do **for** tradicional e o **for-each** em Java.  
Em que situações o **for-each** é mais indicado? Exemplifique.

---

## Resposta

- O **for tradicional** é utilizado quando precisamos de **controle sobre o índice** do vetor ou matriz.  
  Exemplos: acessar posições específicas, modificar elementos em determinados índices, percorrer apenas parte de uma coleção.

- O **for-each** é mais indicado quando queremos apenas **percorrer todos os elementos de uma coleção**, sem a necessidade de manipular os índices.

---

## Exemplo em Código

```java
public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};

        // For tradicional -> acesso pelo índice
        System.out.println("Usando for tradicional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + " valor: " + numeros[i]);
        }

        // For-each -> percorre diretamente os elementos
        System.out.println("\nUsando for-each:");
        for (int n : numeros) {
            System.out.println("Valor: " + n);
        }
    }
}
