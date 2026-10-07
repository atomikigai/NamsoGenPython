package pc;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f7863a;

    public f(String str) {
        Pattern patternCompile = Pattern.compile(str);
        jc.i.d(patternCompile, "compile(...)");
        this.f7863a = patternCompile;
    }

    public final String toString() {
        String string = this.f7863a.toString();
        jc.i.d(string, "toString(...)");
        return string;
    }
}
