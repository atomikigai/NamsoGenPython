package w3;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends Exception {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f9573f = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u3.f f9575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class f9577d;
    public final String e;

    public t(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof t)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((t) th).f9574a.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, s sVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            sVar.append("Cause (");
            int i10 = i + 1;
            sVar.append(String.valueOf(i10));
            sVar.append(" of ");
            sVar.append(String.valueOf(size));
            sVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof t) {
                ((t) th).e(sVar);
            } else {
                c(th, sVar);
            }
            i = i10;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i10 = i + 1;
            sb2.append(i10);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i));
            i = i10;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f9574a, new s(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.e);
        String str2 = "";
        if (this.f9577d != null) {
            str = ", " + this.f9577d;
        } else {
            str = "";
        }
        sb2.append(str);
        int i = this.f9576c;
        sb2.append(i != 0 ? ", ".concat(da.v.y(i)) : "");
        if (this.f9575b != null) {
            str2 = ", " + this.f9575b;
        }
        sb2.append(str2);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Throwable th = (Throwable) obj;
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public t(String str, List list) {
        this.e = str;
        setStackTrace(f9573f);
        this.f9574a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
