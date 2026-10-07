package g;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4050b;

    public /* synthetic */ i(Context context, int i) {
        this.f4049a = i;
        this.f4050b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4049a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = this.f4050b;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (l.b().b()) {
                            String strL = com.bumptech.glide.c.L(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                k.b(systemService, j.a(strL));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                l.f4055f = true;
                break;
            case 1:
                l.q(this.f4050b);
                break;
            case 2:
                (Build.VERSION.SDK_INT >= 28 ? v1.i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i(this.f4050b, 3), new Random().nextInt(Math.max(zzbbs.zzq.zzf, 1)) + 5000);
                break;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new i(this.f4050b, 4));
                break;
            default:
                v1.f.s(this.f4050b, new androidx.webkit.a(3), v1.f.f9129a, false);
                break;
        }
    }

    public /* synthetic */ i(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f4049a = 2;
        this.f4050b = context;
    }
}
