package a3;

import a2.l;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f99f = m.f("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3.a f100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f102c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f103d = new LinkedHashSet();
    public Object e;

    public f(Context context, f3.a aVar) {
        this.f101b = context.getApplicationContext();
        this.f100a = aVar;
    }

    public abstract Object a();

    public final void b(z2.c cVar) {
        synchronized (this.f102c) {
            try {
                if (this.f103d.remove(cVar) && this.f103d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f102c) {
            try {
                Object obj2 = this.e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.e = obj;
                    ((f3.b) ((l) this.f100a).f45d).execute(new e(0, this, new ArrayList(this.f103d)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
