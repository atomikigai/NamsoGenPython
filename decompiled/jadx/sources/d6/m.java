package d6;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.measurement.zzt;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import h6.l0;
import h6.r0;
import java.util.concurrent.Callable;
import o3.r;
import o3.v;
import o3.x;
import z7.e1;
import z7.q;
import z7.v0;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2967b;

    public /* synthetic */ m(Object obj, int i) {
        this.f2966a = i;
        this.f2967b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a  */
    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0193  */
    /* JADX WARN: Code duplicated, block: B:109:0x0195  */
    /* JADX WARN: Code duplicated, block: B:112:0x019c  */
    /* JADX WARN: Code duplicated, block: B:113:0x019e  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ab A[Catch: Exception -> 0x00d7, TryCatch #3 {Exception -> 0x00d7, blocks: (B:51:0x00d0, B:56:0x00e2, B:62:0x0103, B:64:0x0107, B:68:0x0116, B:72:0x0127, B:73:0x0140, B:70:0x011e, B:74:0x0143, B:78:0x014e, B:82:0x0157, B:86:0x0160, B:90:0x0169, B:94:0x0172, B:98:0x017b, B:102:0x0184, B:106:0x018d, B:110:0x0196, B:114:0x019f, B:118:0x01a7, B:120:0x01ab, B:121:0x01b4, B:57:0x00f9, B:54:0x00da), top: B:190:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c9 A[Catch: all -> 0x01e9, TryCatch #2 {all -> 0x01e9, blocks: (B:124:0x01c3, B:126:0x01c9, B:129:0x01d9, B:131:0x01e1, B:134:0x01eb, B:135:0x01fa, B:137:0x020a, B:138:0x0211), top: B:189:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e1 A[Catch: all -> 0x01e9, TryCatch #2 {all -> 0x01e9, blocks: (B:124:0x01c3, B:126:0x01c9, B:129:0x01d9, B:131:0x01e1, B:134:0x01eb, B:135:0x01fa, B:137:0x020a, B:138:0x0211), top: B:189:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01fa A[Catch: all -> 0x01e9, TryCatch #2 {all -> 0x01e9, blocks: (B:124:0x01c3, B:126:0x01c9, B:129:0x01d9, B:131:0x01e1, B:134:0x01eb, B:135:0x01fa, B:137:0x020a, B:138:0x0211), top: B:189:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x020a A[Catch: all -> 0x01e9, TryCatch #2 {all -> 0x01e9, blocks: (B:124:0x01c3, B:126:0x01c9, B:129:0x01d9, B:131:0x01e1, B:134:0x01eb, B:135:0x01fa, B:137:0x020a, B:138:0x0211), top: B:189:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:0x0156  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:0x0168  */
    /* JADX WARN: Code duplicated, block: B:92:0x016f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x0178  */
    /* JADX WARN: Code duplicated, block: B:97:0x017a  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        zzam zzamVar;
        zzie zzieVar;
        int i;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Long lA;
        zzjm zzjmVarZzc;
        zzjt zzjtVarZzc;
        switch (this.f2966a) {
            case 0:
                o oVar = (o) this.f2967b;
                return new zzavc(zzavb.zzu(oVar.f2972d, new zzauz(oVar.f2969a.f5213a, false)));
            case 1:
                l0 l0Var = r0.f5068l;
                r0 r0Var = p.C.f2979c;
                return r0.l((Uri) this.f2967b);
            case 2:
                n1.a aVar = (n1.a) this.f2967b;
                aVar.e.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.f7158r.c();
                    Binder.flushPendingCommands();
                    aVar.a(null);
                    return null;
                } catch (Throwable th) {
                    try {
                        aVar.f7156d.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        aVar.a(null);
                        throw th2;
                    }
                }
            case 3:
                r rVar = (r) this.f2967b;
                o3.b bVar = rVar.e;
                synchronized (bVar.f7470a) {
                    try {
                        if (bVar.f7471b != 3) {
                            boolean z20 = bVar.f7471b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                zzc.zzc(bundle, bVar.f7472c, bVar.f7473d, bVar.A.longValue());
                            }
                            zzie zzieVar2 = zzie.REASON_UNSPECIFIED;
                            synchronized (bVar.f7470a) {
                                zzamVar = bVar.i;
                                break;
                            }
                            if (zzamVar == null) {
                                o3.b bVar2 = rVar.e;
                                bVar2.H(0);
                                int i10 = rVar.f7525d;
                                zzie zzieVar3 = zzie.SERVICE_RESET_TO_NULL;
                                o3.e eVar = x.f7537j;
                                bVar2.G(i10, zzieVar3, eVar);
                                rVar.c(eVar);
                            } else {
                                o3.b bVar3 = rVar.e;
                                String packageName = bVar3.f7475g.getPackageName();
                                int iZzw = 3;
                                int i11 = 25;
                                while (true) {
                                    if (i11 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                iZzw = zzamVar.zzw(i11, packageName, "subs");
                                            } catch (Exception e) {
                                                zzc.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                                boolean z21 = e instanceof DeadObjectException;
                                                if (z21) {
                                                    zzieVar = zzie.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                                } else if (e instanceof RemoteException) {
                                                    zzieVar = zzie.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                                } else {
                                                    zzieVar = e instanceof SecurityException ? zzie.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                                }
                                                String strA = zzieVar.equals(zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? v.a(e) : null;
                                                rVar.e.H(0);
                                                rVar.b(z21 ? x.f7537j : x.h, zzieVar, strA, z20);
                                                rVar.c(z21 ? x.f7537j : x.h);
                                            }
                                        } else {
                                            iZzw = zzamVar.zzc(i11, packageName, "subs", bundle);
                                        }
                                        if (iZzw == 0) {
                                            zzc.zzm("BillingClient", "highestLevelSupportedForSubs: " + i11);
                                        } else {
                                            i11--;
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                }
                                bVar3.f7477k = i11 >= 3;
                                if (i11 < 3) {
                                    zzieVar2 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i12 = 25; i12 >= 3; i12--) {
                                    iZzw = bundle == null ? zzamVar.zzw(i12, packageName, "inapp") : zzamVar.zzc(i12, packageName, "inapp", bundle);
                                    if (iZzw == 0) {
                                        bVar3.f7478l = i12;
                                        zzc.zzm("BillingClient", "mHighestLevelSupportedForInApp: " + i12);
                                        i = bVar3.f7478l;
                                        bVar3.f7478l = i;
                                        if (i >= 26) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        bVar3.f7489w = z4;
                                        if (i >= 24) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        bVar3.f7488v = z10;
                                        if (i >= 21) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        bVar3.f7487u = z11;
                                        if (i >= 20) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        bVar3.f7486t = z12;
                                        if (i >= 19) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        bVar3.f7485s = z13;
                                        if (i >= 17) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        bVar3.f7484r = z14;
                                        if (i >= 16) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        bVar3.f7483q = z15;
                                        if (i >= 15) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        bVar3.f7482p = z16;
                                        if (i >= 14) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        bVar3.f7481o = z17;
                                        if (i >= 9) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        bVar3.f7480n = z18;
                                        if (i >= 6) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        bVar3.f7479m = z19;
                                        if (i < 3) {
                                            zzieVar2 = zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                            zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                        }
                                        o3.b.M(bVar3, iZzw);
                                        if (iZzw != 0) {
                                            o3.e eVar2 = x.f7532b;
                                            rVar.b(eVar2, zzieVar2, null, z20);
                                            rVar.c(eVar2);
                                        } else {
                                            try {
                                                lA = rVar.a(z20);
                                                if (z20) {
                                                    zzhz zzhzVarZzc = zzib.zzc();
                                                    zzhzVarZzc.zzo(6);
                                                    zzjtVarZzc = zzjv.zzc();
                                                    int i13 = rVar.f7525d;
                                                    zzjtVarZzc.zza(i13 > 0);
                                                    zzjtVarZzc.zzl(i13);
                                                    if (lA != null) {
                                                        zzjtVarZzc.zzm(lA.longValue());
                                                    }
                                                    o3.b bVar4 = rVar.e;
                                                    zzhzVarZzc.zzn(zzjtVarZzc);
                                                    bVar4.F((zzib) zzhzVarZzc.zze());
                                                } else {
                                                    zzjmVarZzc = zzjo.zzc();
                                                    zzic zzicVarZzc = zzig.zzc();
                                                    zzicVarZzc.zzo(0);
                                                    zzjmVarZzc.zza(zzicVarZzc);
                                                    if (lA != null) {
                                                        zzjmVarZzc.zzl(lA.longValue());
                                                    }
                                                    rVar.e.h.x((zzjo) zzjmVarZzc.zze());
                                                }
                                            } catch (Throwable th3) {
                                                zzc.zzo("BillingClient", "Unable to log.", th3);
                                            }
                                            rVar.c(x.i);
                                        }
                                    }
                                }
                                i = bVar3.f7478l;
                                bVar3.f7478l = i;
                                if (i >= 26) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                bVar3.f7489w = z4;
                                if (i >= 24) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                bVar3.f7488v = z10;
                                if (i >= 21) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                bVar3.f7487u = z11;
                                if (i >= 20) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                bVar3.f7486t = z12;
                                if (i >= 19) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar3.f7485s = z13;
                                if (i >= 17) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                bVar3.f7484r = z14;
                                if (i >= 16) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                bVar3.f7483q = z15;
                                if (i >= 15) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                bVar3.f7482p = z16;
                                if (i >= 14) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                bVar3.f7481o = z17;
                                if (i >= 9) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                bVar3.f7480n = z18;
                                if (i >= 6) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                bVar3.f7479m = z19;
                                if (i < 3) {
                                    zzieVar2 = zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                o3.b.M(bVar3, iZzw);
                                if (iZzw != 0) {
                                    o3.e eVar3 = x.f7532b;
                                    rVar.b(eVar3, zzieVar2, null, z20);
                                    rVar.c(eVar3);
                                } else {
                                    lA = rVar.a(z20);
                                    if (z20) {
                                        zzhz zzhzVarZzc2 = zzib.zzc();
                                        zzhzVarZzc2.zzo(6);
                                        zzjtVarZzc = zzjv.zzc();
                                        int i14 = rVar.f7525d;
                                        zzjtVarZzc.zza(i14 > 0);
                                        zzjtVarZzc.zzl(i14);
                                        if (lA != null) {
                                            zzjtVarZzc.zzm(lA.longValue());
                                        }
                                        o3.b bVar5 = rVar.e;
                                        zzhzVarZzc2.zzn(zzjtVarZzc);
                                        bVar5.F((zzib) zzhzVarZzc2.zze());
                                    } else {
                                        zzjmVarZzc = zzjo.zzc();
                                        zzic zzicVarZzc2 = zzig.zzc();
                                        zzicVarZzc2.zzo(0);
                                        zzjmVarZzc.zza(zzicVarZzc2);
                                        if (lA != null) {
                                            zzjmVarZzc.zzl(lA.longValue());
                                        }
                                        rVar.e.h.x((zzjo) zzjmVarZzc.zze());
                                    }
                                    rVar.c(x.i);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return null;
            case 4:
                return ((o6.a) this.f2967b).getViewSignals();
            case 5:
                synchronized (((s3.c) this.f2967b)) {
                    try {
                        s3.c cVar = (s3.c) this.f2967b;
                        if (cVar.f8378t != null) {
                            cVar.X();
                            if (((s3.c) this.f2967b).G()) {
                                ((s3.c) this.f2967b).V();
                                ((s3.c) this.f2967b).f8380v = 0;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return null;
            case 6:
                return new zzt(((v0) this.f2967b).f11402v);
            default:
                z2 z2Var = ((e1) this.f2967b).f11104a;
                z2Var.a();
                z7.l0 l0Var2 = z2Var.f11513s;
                z2.D(l0Var2);
                l0Var2.c();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public m(e1 e1Var, q qVar, String str) {
        this.f2966a = 7;
        this.f2967b = e1Var;
    }
}
