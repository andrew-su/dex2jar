package pxb.xjimple;

import org.objectweb.asm.Type;

public class Constant extends Value {
    public static Object Null = new Object();

    public static Constant n(Type type, Object value) {
        return new Constant(type, value);
    }

    public static Constant nByte(byte i) {
        return new Constant(Type.BYTE_TYPE, i);
    }

    public static Constant nChar(char i) {
        return new Constant(Type.CHAR_TYPE, i);
    }

    public static Constant nDouble(double i) {
        return new Constant(Type.DOUBLE_TYPE, i);
    }

    public static Constant nFloat(float i) {
        return new Constant(Type.FLOAT_TYPE, i);
    }

    public static Constant nInt(int i) {
        return new Constant(Type.INT_TYPE, i);
    }

    public static Constant nLong(long i) {
        return new Constant(Type.LONG_TYPE, i);
    }

    public static Constant nNull() {
        return new Constant(Constant.Null);
    }

    public static Constant nShort(short i) {
        return new Constant(Type.SHORT_TYPE, i);
    }

    public static Constant nClass(Type clz) {
        return new Constant(Type.getType("Ljava/lang/Class;"), clz);
    }

    public Type type;

    public Object value;

    public Constant(Object value) {
        super(VT.CONSTANT);
        this.value = value;
    }

    public Constant(Type type, Object value) {
        super(VT.CONSTANT);
        this.value = value;
        this.type = type;
    }

    public String toString() {
        if (Null == value)
            return "null";
        return "" + value;
    }
}