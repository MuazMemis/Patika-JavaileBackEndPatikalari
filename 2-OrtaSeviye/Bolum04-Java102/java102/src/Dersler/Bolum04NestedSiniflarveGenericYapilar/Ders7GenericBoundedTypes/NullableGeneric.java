package Dersler.Bolum04NestedSiniflarveGenericYapilar.Ders7GenericBoundedTypes;

public class NullableGeneric<T extends A> {
    private final T value;

    public NullableGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("Bu değişkene değer atanmamıştır.");
        } else {
            System.out.println(this.getValue());
        }
    }
}
