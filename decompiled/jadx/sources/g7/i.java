package g7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.common.zzc;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import o6.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements p4.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i f4246c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f4248b;

    public /* synthetic */ i(Object obj) {
        this.f4247a = obj;
    }

    public static i b(Context context) {
        i0.i(context);
        synchronized (i.class) {
            if (f4246c == null) {
                m mVar = q.f4263a;
                synchronized (q.class) {
                    if (q.e == null) {
                        q.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f4246c = new i(context);
            }
        }
        return f4246c;
    }

    public static final n d(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < nVarArr.length; i++) {
                if (nVarArr[i].equals(oVar)) {
                    return nVarArr[i];
                }
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z4) {
        PackageInfo packageInfo2;
        if (!z4) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z4 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z4 ? d(packageInfo2, p.f4262a) : d(packageInfo2, p.f4262a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public y3.a a() {
        if (((y3.a) this.f4248b) == null) {
            synchronized (this) {
                try {
                    if (((y3.a) this.f4248b) == null) {
                        File cacheDir = ((a4.i) ((h0) this.f4247a).f7621a).f150b.getCacheDir();
                        kb.d dVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            dVar = new kb.d();
                            dVar.f6154d = new s5.j(18);
                            dVar.f6153c = file;
                            dVar.f6151a = 262144000L;
                            dVar.f6152b = new s5.j(19);
                        }
                        this.f4248b = dVar;
                    }
                    if (((y3.a) this.f4248b) == null) {
                        this.f4248b = new r7.j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (y3.a) this.f4248b;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    public boolean c(int i) {
        v vVar;
        int length;
        boolean zZzf;
        v vVar2;
        ApplicationInfo applicationInfo;
        v vVar3;
        String[] packagesForUid = ((Context) this.f4247a).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            vVar = new v(false, "no pkgs", null);
        } else {
            vVar = null;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i0.i(vVar);
                    break;
                }
                String str = packagesForUid[i10];
                if (str == null) {
                    vVar = new v(false, "null pkg", null);
                } else if (str.equals((String) this.f4248b)) {
                    vVar = v.f4280d;
                } else {
                    m mVar = q.f4263a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            q.b();
                            f0 f0Var = (f0) q.f4265c;
                            Parcel parcelZzB = f0Var.zzB(7, f0Var.zza());
                            zZzf = zzc.zzf(parcelZzB);
                            parcelZzB.recycle();
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    } catch (RemoteException | r7.b e) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                        zZzf = false;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    if (zZzf) {
                        boolean zA = h.a((Context) this.f4247a);
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            i0.i(q.e);
                            try {
                                q.b();
                                r rVar = new r(str, zA, false, new q7.b(q.e), false, true);
                                try {
                                    f0 f0Var2 = (f0) q.f4265c;
                                    Parcel parcelZza = f0Var2.zza();
                                    zzc.zzc(parcelZza, rVar);
                                    Parcel parcelZzB2 = f0Var2.zzB(6, parcelZza);
                                    s sVar = (s) zzc.zza(parcelZzB2, s.CREATOR);
                                    parcelZzB2.recycle();
                                    if (sVar.f4272a) {
                                        jd.l.z(sVar.f4275d);
                                        vVar2 = new v(true, null, null);
                                    } else {
                                        String str2 = sVar.f4273b;
                                        PackageManager.NameNotFoundException nameNotFoundException = n9.b.E(sVar.f4274c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        jd.l.z(sVar.f4275d);
                                        n9.b.E(sVar.f4274c);
                                        vVar3 = new v(false, str2, nameNotFoundException);
                                        vVar2 = vVar3;
                                    }
                                } catch (RemoteException e4) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                                    vVar3 = new v(false, "module call", e4);
                                }
                            } catch (r7.b e10) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                vVar3 = new v(false, "module init: ".concat(String.valueOf(e10.getMessage())), e10);
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            throw th2;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = ((Context) this.f4247a).getPackageManager().getPackageInfo(str, 64);
                            boolean zA2 = h.a((Context) this.f4247a);
                            if (packageInfo == null) {
                                vVar2 = new v(false, "null pkg", null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    vVar2 = new v(false, "single cert required", null);
                                } else {
                                    o oVar = new o(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        v vVarA = q.a(str3, oVar, zA2, false);
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        if (!vVarA.f4281a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                            vVar2 = vVarA;
                                        } else {
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                v vVarA2 = q.a(str3, oVar, false, true);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                if (vVarA2.f4281a) {
                                                    vVar2 = new v(false, "debuggable release cert app rejected", null);
                                                } else {
                                                    vVar2 = vVarA;
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        throw th4;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e11) {
                            vVar = new v(false, "no pkg ".concat(str), e11);
                        }
                    }
                    if (vVar2.f4281a) {
                        this.f4248b = str;
                    }
                    vVar = vVar2;
                }
                if (vVar.f4281a) {
                    break;
                }
                i10++;
            }
        }
        Throwable th5 = vVar.f4283c;
        if (!vVar.f4281a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", vVar.a(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", vVar.a());
            }
        }
        return vVar.f4281a;
    }

    @Override // p4.g
    public Object get() {
        if (this.f4248b == null) {
            synchronized (this) {
                try {
                    if (this.f4248b == null) {
                        Object obj = ((p4.g) this.f4247a).get();
                        p4.f.c(obj, "Argument must not be null");
                        this.f4248b = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4248b;
    }

    public i(Context context) {
        this.f4247a = context.getApplicationContext();
    }

    public i() {
        this.f4247a = new CopyOnWriteArraySet();
    }
}
