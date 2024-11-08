// src/Franc.java
public class Franc extends Money {
    
    // Construtor
    public Franc(int amount) {
        super(amount);  // Chama o construtor da classe Money
    }

    // Sobrescreve o método times para retornar um novo objeto Franc
    @Override
    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
