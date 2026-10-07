package b6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import g7.f;
import g7.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g7.a f1408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzf f1409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1411d = new Object();
    public d e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f1412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1413g;

    public b(Context context, long j4, boolean z4) {
        Context applicationContext;
        i0.i(context);
        if (z4 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f1412f = context;
        this.f1410c = false;
        this.f1413g = j4;
    }

    public static a a(Context context) {
        b bVar = new b(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bVar.d(false);
            a aVarF = bVar.f();
            e(aVarF, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            bVar.c();
            return aVarF;
        } catch (Throwable th) {
            try {
                e(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                bVar.c();
                throw th2;
            }
        }
    }

    public static boolean b(Context context) {
        boolean zZzd;
        b bVar = new b(context, -1L, false);
        try {
            bVar.d(false);
            i0.h("Calling this from your main thread can lead to deadlock");
            synchronized (bVar) {
                try {
                    if (!bVar.f1410c) {
                        synchronized (bVar.f1411d) {
                            d dVar = bVar.e;
                            if (dVar == null || !dVar.f1419d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            bVar.d(false);
                            if (!bVar.f1410c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    i0.i(bVar.f1408a);
                    i0.i(bVar.f1409b);
                    try {
                        zZzd = bVar.f1409b.zzd();
                    } catch (RemoteException e4) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e4);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar.g();
            bVar.c();
            return zZzd;
        } catch (Throwable th2) {
            bVar.c();
            throw th2;
        }
    }

    public static void e(a aVar, long j4, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (aVar != null) {
                map.put("limit_ad_tracking", true != aVar.f1407b ? "0" : "1");
                String str = aVar.f1406a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j4));
            new c(0, map).start();
        }
    }

    public final void c() {
        i0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f1412f == null || this.f1408a == null) {
                    return;
                }
                try {
                    if (this.f1410c) {
                        m7.a.b().c(this.f1412f, this.f1408a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f1410c = false;
                this.f1409b = null;
                this.f1408a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z4) {
        i0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f1410c) {
                    c();
                }
                Context context = this.f1412f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iD = f.f4241b.d(context, 12451000);
                    if (iD != 0 && iD != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    g7.a aVar = new g7.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!m7.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f1408a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            this.f1409b = zze.zza(aVar.a());
                            this.f1410c = true;
                            if (z4) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final a f() {
        a aVar;
        i0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f1410c) {
                    synchronized (this.f1411d) {
                        d dVar = this.e;
                        if (dVar == null || !dVar.f1419d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f1410c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                i0.i(this.f1408a);
                i0.i(this.f1409b);
                try {
                    aVar = new a(this.f1409b.zzc(), this.f1409b.zze(true));
                } catch (RemoteException e4) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e4);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return aVar;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f1411d) {
            d dVar = this.e;
            if (dVar != null) {
                dVar.f1418c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j4 = this.f1413g;
            if (j4 > 0) {
                this.e = new d(this, j4);
            }
        }
    }
}
