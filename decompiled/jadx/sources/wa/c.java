package wa;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import m0.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements e, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.c f9877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ya.b f9879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f9880d;
    public final Executor e;

    public c(Context context, String str, Set set, ya.b bVar, Executor executor) {
        this.f9877a = new n9.c(context, str);
        this.f9880d = set;
        this.e = executor;
        this.f9879c = bVar;
        this.f9878b = context;
    }

    public final void a() {
        if (this.f9880d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!o.a(this.f9878b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new b(this, 1));
        }
    }
}
