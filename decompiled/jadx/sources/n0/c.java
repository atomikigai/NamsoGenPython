package n0;

import android.content.Context;
import bd.u;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f7134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f7135d;
    public final /* synthetic */ int e;

    public /* synthetic */ c(String str, Context context, u uVar, int i, int i10) {
        this.f7132a = i10;
        this.f7133b = str;
        this.f7134c = context;
        this.f7135d = uVar;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7132a) {
            case 0:
                return f.a(this.f7133b, this.f7134c, this.f7135d, this.e);
            default:
                try {
                    return f.a(this.f7133b, this.f7134c, this.f7135d, this.e);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
