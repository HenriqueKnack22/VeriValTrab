// src/Money.java
public class Money {
    protected int amount;

    // Construtor
    public Money(int amount) {
        this.amount = amount;
    }

    // Método times (multiplicação)
    public Money times(int multiplier) {
        return new Money(amount * multiplier);
    }

    // Método equals para comparar objetos Money
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Money money = (Money) object;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(amount);
    }
}
