package pc;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f7846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f7847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Charset f7848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Charset f7849d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        jc.i.d(charsetForName, "forName(...)");
        f7846a = charsetForName;
        jc.i.d(Charset.forName("UTF-16"), "forName(...)");
        jc.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        jc.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        jc.i.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        jc.i.d(charsetForName2, "forName(...)");
        f7847b = charsetForName2;
    }
}
