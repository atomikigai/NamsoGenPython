package z7;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends zzbn implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f11104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f11105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11106c;

    public e1(z2 z2Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        com.google.android.gms.common.internal.i0.i(z2Var);
        this.f11104a = z2Var;
        this.f11106c = null;
    }

    @Override // z7.b0
    public final void H(f3 f3Var) {
        com.google.android.gms.common.internal.i0.e(f3Var.f11119a);
        com.google.android.gms.common.internal.i0.i(f3Var.G);
        c1 c1Var = new c1(this, f3Var, 2);
        z2 z2Var = this.f11104a;
        if (z2Var.zzaB().n()) {
            c1Var.run();
        } else {
            z2Var.zzaB().m(c1Var);
        }
    }

    public final void I(Runnable runnable) {
        z2 z2Var = this.f11104a;
        if (z2Var.zzaB().n()) {
            runnable.run();
        } else {
            z2Var.zzaB().l(runnable);
        }
    }

    public final void J(f3 f3Var) {
        com.google.android.gms.common.internal.i0.i(f3Var);
        String str = f3Var.f11119a;
        com.google.android.gms.common.internal.i0.e(str);
        K(str, false);
        this.f11104a.L().D(f3Var.f11120b, f3Var.B);
    }

    public final void K(String str, boolean z4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        z2 z2Var = this.f11104a;
        if (zIsEmpty) {
            z2Var.zzaA().f11190f.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z4) {
            try {
                if (this.f11105b == null) {
                    boolean z10 = true;
                    if (!"com.google.android.gms".equals(this.f11106c) && !n7.c.j(z2Var.f11517w.f11000a, Binder.getCallingUid()) && !g7.i.b(z2Var.f11517w.f11000a).c(Binder.getCallingUid())) {
                        z10 = false;
                    }
                    this.f11105b = Boolean.valueOf(z10);
                }
                if (this.f11105b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                z2Var.zzaA().f11190f.c(i0.k(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f11106c == null) {
            Context context = z2Var.f11517w.f11000a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = g7.h.f4242a;
            if (n7.c.n(context, str, callingUid)) {
                this.f11106c = str;
            }
        }
        if (str.equals(this.f11106c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // z7.b0
    public final void a(Bundle bundle, f3 f3Var) {
        J(f3Var);
        String str = f3Var.f11119a;
        com.google.android.gms.common.internal.i0.i(str);
        I(new b3.b(this, str, bundle, 21, false));
    }

    @Override // z7.b0
    public final List c(String str, String str2, String str3, boolean z4) {
        K(str, true);
        z2 z2Var = this.f11104a;
        try {
            List<b3> list = (List) z2Var.zzaB().j(new b1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b3 b3Var : list) {
                if (z4 || !d3.O(b3Var.f11035c)) {
                    arrayList.add(new a3(b3Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            z2Var.zzaA().f11190f.d(i0.k(str), "Failed to get user properties as. appId", e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e4) {
            e = e4;
            z2Var.zzaA().f11190f.d(i0.k(str), "Failed to get user properties as. appId", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // z7.b0
    public final void e(f3 f3Var) {
        J(f3Var);
        I(new c1(this, f3Var, 1));
    }

    @Override // z7.b0
    public final void f(f3 f3Var) {
        J(f3Var);
        I(new c1(this, f3Var, 3));
    }

    @Override // z7.b0
    public final List h(String str, String str2, f3 f3Var) {
        J(f3Var);
        String str3 = f3Var.f11119a;
        com.google.android.gms.common.internal.i0.i(str3);
        z2 z2Var = this.f11104a;
        try {
            return (List) z2Var.zzaB().j(new b1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            z2Var.zzaA().f11190f.c(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // z7.b0
    public final List i(String str, String str2, String str3) {
        K(str, true);
        z2 z2Var = this.f11104a;
        try {
            return (List) z2Var.zzaB().j(new b1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            z2Var.zzaA().f11190f.c(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // z7.b0
    public final void j(a3 a3Var, f3 f3Var) {
        com.google.android.gms.common.internal.i0.i(a3Var);
        J(f3Var);
        I(new b3.b(this, a3Var, f3Var, 25));
    }

    @Override // z7.b0
    public final void k(f3 f3Var) {
        com.google.android.gms.common.internal.i0.e(f3Var.f11119a);
        K(f3Var.f11119a, false);
        I(new c1(this, f3Var, 0));
    }

    @Override // z7.b0
    public final List l(String str, String str2, boolean z4, f3 f3Var) {
        J(f3Var);
        String str3 = f3Var.f11119a;
        com.google.android.gms.common.internal.i0.i(str3);
        z2 z2Var = this.f11104a;
        try {
            List<b3> list = (List) z2Var.zzaB().j(new b1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b3 b3Var : list) {
                if (z4 || !d3.O(b3Var.f11035c)) {
                    arrayList.add(new a3(b3Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            z2Var.zzaA().f11190f.d(i0.k(str3), "Failed to query user properties. appId", e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e4) {
            e = e4;
            z2Var.zzaA().f11190f.d(i0.k(str3), "Failed to query user properties. appId", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // z7.b0
    public final String m(f3 f3Var) {
        J(f3Var);
        z2 z2Var = this.f11104a;
        try {
            return (String) z2Var.zzaB().j(new d6.g(z2Var, f3Var, 8, false)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            z2Var.zzaA().f11190f.d(i0.k(f3Var.f11119a), "Failed to get app instance id. appId", e);
            return null;
        }
    }

    @Override // z7.b0
    public final void q(long j4, String str, String str2, String str3) {
        I(new d1(this, str2, str3, str, j4, 0));
    }

    @Override // z7.b0
    public final void r(q qVar, f3 f3Var) {
        com.google.android.gms.common.internal.i0.i(qVar);
        J(f3Var);
        I(new b3.b(this, qVar, f3Var, 23));
    }

    @Override // z7.b0
    public final byte[] s(q qVar, String str) {
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.i(qVar);
        K(str, true);
        z2 z2Var = this.f11104a;
        fd.b bVar = z2Var.zzaA().f11197x;
        a1 a1Var = z2Var.f11517w;
        e0 e0Var = a1Var.f11011x;
        String str2 = qVar.f11302a;
        bVar.c(e0Var.d(str2), "Log and bundle. event");
        ((n7.b) z2Var.zzax()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        z0 z0VarZzaB = z2Var.zzaB();
        d6.m mVar = new d6.m(this, qVar, str);
        z0VarZzaB.e();
        x0 x0Var = new x0(z0VarZzaB, mVar, true);
        if (Thread.currentThread() == z0VarZzaB.f11496c) {
            x0Var.run();
        } else {
            z0VarZzaB.o(x0Var);
        }
        try {
            byte[] bArr = (byte[]) x0Var.get();
            if (bArr == null) {
                z2Var.zzaA().f11190f.c(i0.k(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((n7.b) z2Var.zzax()).getClass();
            z2Var.zzaA().f11197x.e("Log and bundle processed. event, size, time_ms", a1Var.f11011x.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            z2Var.zzaA().f11190f.e("Failed to log and bundle. appId, event, error", i0.k(str), a1Var.f11011x.d(str2), e);
            return null;
        } catch (ExecutionException e4) {
            e = e4;
            z2Var.zzaA().f11190f.e("Failed to log and bundle. appId, event, error", i0.k(str), a1Var.f11011x.d(str2), e);
            return null;
        }
    }

    public final void y(q qVar, f3 f3Var) {
        z2 z2Var = this.f11104a;
        z2Var.a();
        z2Var.e(qVar, f3Var);
    }

    @Override // z7.b0
    public final void z(c cVar, f3 f3Var) {
        com.google.android.gms.common.internal.i0.i(cVar);
        com.google.android.gms.common.internal.i0.i(cVar.f11039c);
        J(f3Var);
        c cVar2 = new c(cVar);
        cVar2.f11037a = f3Var.f11119a;
        I(new b3.b(this, cVar2, f3Var, 22));
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) {
        ArrayList arrayList;
        switch (i) {
            case 1:
                q qVar = (q) zzbo.zza(parcel, q.CREATOR);
                f3 f3Var = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                r(qVar, f3Var);
                parcel2.writeNoException();
                return true;
            case 2:
                a3 a3Var = (a3) zzbo.zza(parcel, a3.CREATOR);
                f3 f3Var2 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                j(a3Var, f3Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                f3 f3Var3 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                f(f3Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                q qVar2 = (q) zzbo.zza(parcel, q.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                zzbo.zzc(parcel);
                com.google.android.gms.common.internal.i0.i(qVar2);
                com.google.android.gms.common.internal.i0.e(string);
                K(string, true);
                I(new b3.b(this, qVar2, string, 24));
                parcel2.writeNoException();
                return true;
            case 6:
                f3 f3Var4 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                e(f3Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                f3 f3Var5 = (f3) zzbo.zza(parcel, f3.CREATOR);
                boolean zZzf = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                J(f3Var5);
                String str = f3Var5.f11119a;
                com.google.android.gms.common.internal.i0.i(str);
                z2 z2Var = this.f11104a;
                try {
                    List<b3> list = (List) z2Var.zzaB().j(new d6.g(this, str, 7, false)).get();
                    arrayList = new ArrayList(list.size());
                    for (b3 b3Var : list) {
                        if (zZzf || !d3.O(b3Var.f11035c)) {
                            arrayList.add(new a3(b3Var));
                        }
                        break;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    z2Var.zzaA().f11190f.d(i0.k(str), "Failed to get user properties. appId", e);
                    arrayList = null;
                } catch (ExecutionException e4) {
                    e = e4;
                    z2Var.zzaA().f11190f.d(i0.k(str), "Failed to get user properties. appId", e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                q qVar3 = (q) zzbo.zza(parcel, q.CREATOR);
                String string2 = parcel.readString();
                zzbo.zzc(parcel);
                byte[] bArrS = s(qVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrS);
                return true;
            case 10:
                long j4 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzbo.zzc(parcel);
                q(j4, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                f3 f3Var6 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                String strM = m(f3Var6);
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 12:
                c cVar = (c) zzbo.zza(parcel, c.CREATOR);
                f3 f3Var7 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                z(cVar, f3Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                c cVar2 = (c) zzbo.zza(parcel, c.CREATOR);
                zzbo.zzc(parcel);
                com.google.android.gms.common.internal.i0.i(cVar2);
                com.google.android.gms.common.internal.i0.i(cVar2.f11039c);
                com.google.android.gms.common.internal.i0.e(cVar2.f11037a);
                K(cVar2.f11037a, true);
                I(new y9.j(5, this, new c(cVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean zZzf2 = zzbo.zzf(parcel);
                f3 f3Var8 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                List listL = l(string6, string7, zZzf2, f3Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean zZzf3 = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                List listC = c(string8, string9, string10, zZzf3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                f3 f3Var9 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                List listH = h(string11, string12, f3Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                zzbo.zzc(parcel);
                List listI = i(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case 18:
                f3 f3Var10 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                k(f3Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                f3 f3Var11 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                a(bundle, f3Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                f3 f3Var12 = (f3) zzbo.zza(parcel, f3.CREATOR);
                zzbo.zzc(parcel);
                H(f3Var12);
                parcel2.writeNoException();
                return true;
        }
    }
}
