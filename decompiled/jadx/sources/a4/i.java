package a4;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y, k, androidx.emoji2.text.k, p4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f150b;

    public /* synthetic */ i(Context context, int i, boolean z4) {
        this.f149a = i;
        this.f150b = context;
    }

    @Override // a4.k
    public Class a() {
        return InputStream.class;
    }

    @Override // a4.k
    public Object b(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResource(i);
    }

    @Override // androidx.emoji2.text.k
    public void c(jd.l lVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.emoji2.text.m(this, lVar, threadPoolExecutor, 0));
    }

    @Override // a4.k
    public void d(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // p4.g
    public Object get() {
        return (ConnectivityManager) this.f150b.getSystemService("connectivity");
    }

    @Override // a4.y
    public x i(e0 e0Var) {
        switch (this.f149a) {
            case 0:
                return new c(this.f150b, this);
            case 1:
                return new c(this.f150b, e0Var.a(Integer.class, InputStream.class));
            default:
                return new t(this.f150b, 2);
        }
    }

    public i(Context context, int i) {
        this.f149a = i;
        switch (i) {
            case 6:
                com.google.android.gms.common.internal.i0.i(context);
                Context applicationContext = context.getApplicationContext();
                com.google.android.gms.common.internal.i0.i(applicationContext);
                this.f150b = applicationContext;
                break;
            default:
                this.f150b = context.getApplicationContext();
                break;
        }
    }
}
