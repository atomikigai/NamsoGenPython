package l5;

import android.content.Context;
import da.v;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static volatile j e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5.a f6839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.a f6840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5.c f6841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.j f6842d;

    public q(u5.a aVar, u5.a aVar2, q5.c cVar, c3.j jVar, a3.j jVar2) {
        this.f6839a = aVar;
        this.f6840b = aVar2;
        this.f6841c = cVar;
        this.f6842d = jVar;
        ((Executor) jVar2.f107a).execute(new androidx.activity.d(jVar2, 17));
    }

    public static q a() {
        j jVar = e;
        if (jVar != null) {
            return (q) jVar.f6829f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (q.class) {
                try {
                    if (e == null) {
                        a4.g gVar = new a4.g();
                        context.getClass();
                        gVar.f142a = context;
                        e = gVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final p c(k kVar) {
        byte[] bytes;
        Set setUnmodifiableSet = kVar != null ? Collections.unmodifiableSet(j5.a.f5688d) : Collections.singleton(new i5.b("proto"));
        a2.l lVarA = i.a();
        kVar.getClass();
        lVarA.f43b = "cct";
        j5.a aVar = (j5.a) kVar;
        String str = aVar.f5690a;
        String str2 = aVar.f5691b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = v.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        lVarA.f44c = bytes;
        return new p(setUnmodifiableSet, lVarA.h(), this);
    }
}
