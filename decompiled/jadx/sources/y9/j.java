package y9;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.manager.q;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import z7.a1;
import z7.b0;
import z7.b2;
import z7.c0;
import z7.d0;
import z7.d3;
import z7.e1;
import z7.f3;
import z7.g1;
import z7.i0;
import z7.i1;
import z7.j1;
import z7.j2;
import z7.k1;
import z7.k2;
import z7.l1;
import z7.n1;
import z7.p0;
import z7.q0;
import z7.r0;
import z7.s0;
import z7.t2;
import z7.v;
import z7.x1;
import z7.z;
import z7.z0;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10660c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.f10658a = i;
        this.f10660c = obj;
        this.f10659b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f10659b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        y9.k.f10661f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f10659b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f10659b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f10660c     // Catch: java.lang.Throwable -> L58
            y9.k r2 = (y9.k) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f10663b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f10660c     // Catch: java.lang.Throwable -> L20
            y9.k r0 = (y9.k) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f10664c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f10665d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f10665d = r6     // Catch: java.lang.Throwable -> L20
            r0.f10664c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f10660c     // Catch: java.lang.Throwable -> L20
            y9.k r4 = (y9.k) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f10663b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f10659b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f10660c     // Catch: java.lang.Throwable -> L20
            y9.k r0 = (y9.k) r0     // Catch: java.lang.Throwable -> L20
            r0.f10664c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f10659b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f10659b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = y9.k.f10661f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f10659b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f10659b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.j.a():void");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0359 A[Catch: NameNotFoundException -> 0x0378, TryCatch #7 {NameNotFoundException -> 0x0378, blocks: (B:107:0x034e, B:109:0x0359, B:111:0x0365), top: B:387:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0365 A[Catch: NameNotFoundException -> 0x0378, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x0378, blocks: (B:107:0x034e, B:109:0x0359, B:111:0x0365), top: B:387:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x036a  */
    /* JADX WARN: Code duplicated, block: B:122:0x039d  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:128:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:129:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:130:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:131:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:132:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:134:0x0400  */
    /* JADX WARN: Code duplicated, block: B:135:0x040d  */
    /* JADX WARN: Code duplicated, block: B:136:0x041a  */
    /* JADX WARN: Code duplicated, block: B:139:0x042c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0439  */
    /* JADX WARN: Code duplicated, block: B:144:0x043a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0443 A[Catch: IllegalStateException -> 0x0463, TryCatch #11 {IllegalStateException -> 0x0463, blocks: (B:141:0x042f, B:145:0x043b, B:147:0x0443, B:151:0x0452, B:155:0x0460, B:154:0x045c, B:150:0x044e, B:159:0x0467, B:161:0x0478, B:163:0x047d, B:162:0x047b), top: B:395:0x042f }] */
    /* JADX WARN: Code duplicated, block: B:149:0x044d  */
    /* JADX WARN: Code duplicated, block: B:150:0x044e A[Catch: IllegalStateException -> 0x0463, TryCatch #11 {IllegalStateException -> 0x0463, blocks: (B:141:0x042f, B:145:0x043b, B:147:0x0443, B:151:0x0452, B:155:0x0460, B:154:0x045c, B:150:0x044e, B:159:0x0467, B:161:0x0478, B:163:0x047d, B:162:0x047b), top: B:395:0x042f }] */
    /* JADX WARN: Code duplicated, block: B:153:0x045a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0467 A[Catch: IllegalStateException -> 0x0463, TryCatch #11 {IllegalStateException -> 0x0463, blocks: (B:141:0x042f, B:145:0x043b, B:147:0x0443, B:151:0x0452, B:155:0x0460, B:154:0x045c, B:150:0x044e, B:159:0x0467, B:161:0x0478, B:163:0x047d, B:162:0x047b), top: B:395:0x042f }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0478 A[Catch: IllegalStateException -> 0x0463, TryCatch #11 {IllegalStateException -> 0x0463, blocks: (B:141:0x042f, B:145:0x043b, B:147:0x0443, B:151:0x0452, B:155:0x0460, B:154:0x045c, B:150:0x044e, B:159:0x0467, B:161:0x0478, B:163:0x047d, B:162:0x047b), top: B:395:0x042f }] */
    /* JADX WARN: Code duplicated, block: B:162:0x047b A[Catch: IllegalStateException -> 0x0463, TryCatch #11 {IllegalStateException -> 0x0463, blocks: (B:141:0x042f, B:145:0x043b, B:147:0x0443, B:151:0x0452, B:155:0x0460, B:154:0x045c, B:150:0x044e, B:159:0x0467, B:161:0x0478, B:163:0x047d, B:162:0x047b), top: B:395:0x042f }] */
    /* JADX WARN: Code duplicated, block: B:168:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:170:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:173:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:177:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:178:0x04d3 A[Catch: NotFoundException -> 0x04d8, TRY_LEAVE, TryCatch #8 {NotFoundException -> 0x04d8, blocks: (B:175:0x04c1, B:178:0x04d3), top: B:389:0x04c1 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:187:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:190:0x0504  */
    /* JADX WARN: Code duplicated, block: B:193:0x0518  */
    /* JADX WARN: Code duplicated, block: B:195:0x051c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0523  */
    /* JADX WARN: Code duplicated, block: B:199:0x0554  */
    /* JADX WARN: Code duplicated, block: B:201:0x055a  */
    /* JADX WARN: Code duplicated, block: B:202:0x055c  */
    /* JADX WARN: Code duplicated, block: B:204:0x056a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0573  */
    /* JADX WARN: Code duplicated, block: B:208:0x0595  */
    /* JADX WARN: Code duplicated, block: B:211:0x05eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:240:0x0661  */
    /* JADX WARN: Code duplicated, block: B:241:0x0669  */
    /* JADX WARN: Code duplicated, block: B:244:0x0679  */
    /* JADX WARN: Code duplicated, block: B:247:0x0695  */
    /* JADX WARN: Code duplicated, block: B:252:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:254:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:256:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:259:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:262:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:266:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:270:0x0705 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x0706 A[Catch: NameNotFoundException -> 0x0719, TryCatch #6 {NameNotFoundException -> 0x0719, blocks: (B:268:0x06ff, B:271:0x0706, B:273:0x0712), top: B:385:0x06ff }] */
    /* JADX WARN: Code duplicated, block: B:278:0x071d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0733  */
    /* JADX WARN: Code duplicated, block: B:282:0x0743  */
    /* JADX WARN: Code duplicated, block: B:284:0x0752  */
    /* JADX WARN: Code duplicated, block: B:286:0x0783  */
    /* JADX WARN: Code duplicated, block: B:288:0x079f  */
    /* JADX WARN: Code duplicated, block: B:289:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:292:0x07be  */
    /* JADX WARN: Code duplicated, block: B:297:0x082b  */
    /* JADX WARN: Code duplicated, block: B:300:0x0847  */
    /* JADX WARN: Code duplicated, block: B:308:0x0882  */
    /* JADX WARN: Code duplicated, block: B:310:0x0891  */
    /* JADX WARN: Code duplicated, block: B:312:0x0899  */
    /* JADX WARN: Code duplicated, block: B:313:0x089b  */
    /* JADX WARN: Code duplicated, block: B:315:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:319:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:379:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x04c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x045c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x014c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0258 A[PHI: r15
      0x0258: PHI (r15v2 long) = (r15v1 long), (r15v14 long) binds: [B:75:0x0239, B:77:0x0241] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        q0 q0Var;
        n1 n1Var;
        String string;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        String str;
        int i;
        String str2;
        boolean z4;
        int iG;
        a1 a1Var;
        Bundle bundleJ;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        fd.b bVar;
        String strG;
        Context context;
        long j4;
        x1 x1Var;
        q0 q0Var2;
        q qVar;
        p0 p0Var;
        j1 j1VarH;
        Boolean boolK;
        j1 j1Var;
        j1 j1Var2;
        s0 s0Var;
        String strH;
        String string2;
        String str3;
        Boolean boolValueOf;
        boolean zB;
        SharedPreferences sharedPreferences;
        boolean zContains;
        c0 c0VarJ;
        c0 c0VarJ2;
        boolean z10;
        ServiceInfo serviceInfo;
        boolean zEquals;
        Iterator it;
        String str4;
        d3 d3Var;
        String strI;
        String str5;
        Resources resources;
        int identifier;
        String string3;
        Long lValueOf;
        switch (this.f10658a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((k) this.f10660c).f10663b) {
                        ((k) this.f10660c).f10664c = 1;
                        throw e;
                    }
                }
            case 1:
                z3.b bVar2 = (z3.b) this.f10660c;
                if (bVar2.f10963d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f10659b).run();
                    return;
                } catch (Throwable th) {
                    bVar2.f10962c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 2:
                ((g1) this.f10659b).zzay();
                if (v.a()) {
                    ((g1) this.f10659b).zzaB().l(this);
                    return;
                }
                boolean z11 = ((z7.k) this.f10660c).f11223c != 0;
                ((z7.k) this.f10660c).f11223c = 0L;
                if (z11) {
                    ((z7.k) this.f10660c).b();
                    return;
                }
                return;
            case 3:
                r0 r0Var = (r0) this.f10660c;
                s0 s0Var2 = r0Var.f11326b;
                String str6 = r0Var.f11325a;
                zzbr zzbrVar = (zzbr) this.f10659b;
                a1 a1Var2 = s0Var2.f11339b;
                z0 z0Var = a1Var2.f11008u;
                a1.f(z0Var);
                z0Var.c();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", str6);
                try {
                    if (zzbrVar.zzd(bundle) == null) {
                        i0 i0Var = a1Var2.f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.b("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e4) {
                    i0 i0Var2 = a1Var2.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11190f.c(e4.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                z0 z0Var2 = a1Var2.f11008u;
                a1.f(z0Var2);
                z0Var2.c();
                throw new IllegalStateException("Unexpected call on client side");
            case 4:
                a1 a1Var3 = (a1) this.f10660c;
                q0 q0Var3 = a1Var3.f11006s;
                n1 n1Var2 = (n1) this.f10659b;
                z0 z0Var3 = a1Var3.f11008u;
                AtomicInteger atomicInteger = a1Var3.Q;
                i0 i0Var3 = a1Var3.f11007t;
                a1.f(z0Var3);
                z0Var3.c();
                z7.g gVar = a1Var3.f11005r;
                ((a1) gVar.f159a).getClass();
                z7.l lVar = new z7.l(a1Var3);
                lVar.f();
                a1Var3.G = lVar;
                c0 c0Var = new c0(a1Var3, n1Var2.f11277f);
                c0Var.e();
                a1Var3.H = c0Var;
                d0 d0Var = new d0(a1Var3);
                d0Var.e();
                a1Var3.E = d0Var;
                k2 k2Var = new k2(a1Var3);
                k2Var.e();
                a1Var3.F = k2Var;
                d3 d3Var2 = a1Var3.f11010w;
                boolean z12 = d3Var2.f11115b;
                a1 a1Var4 = (a1) d3Var2.f159a;
                if (z12) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                d3Var2.c();
                SecureRandom secureRandom = new SecureRandom();
                long jNextLong = secureRandom.nextLong();
                if (jNextLong == 0) {
                    jNextLong = secureRandom.nextLong();
                    if (jNextLong == 0) {
                        i0 i0Var4 = ((a1) d3Var2.f159a).f11007t;
                        a1.f(i0Var4);
                        i0Var4.f11193t.b("Utils falling back to Random for random id");
                    }
                }
                d3Var2.f11084d.set(jNextLong);
                a1Var4.a();
                d3Var2.f11115b = true;
                if (q0Var3.f11115b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                SharedPreferences sharedPreferences2 = ((a1) q0Var3.f159a).f11000a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                q0Var3.f11306c = sharedPreferences2;
                boolean z13 = sharedPreferences2.getBoolean("has_been_opened", false);
                q0Var3.A = z13;
                if (!z13) {
                    SharedPreferences.Editor editorEdit = q0Var3.f11306c.edit();
                    editorEdit.putBoolean("has_been_opened", true);
                    editorEdit.apply();
                }
                long jMax = Math.max(0L, ((Long) z.f11453d.a(null)).longValue());
                kb.d dVar = new kb.d();
                dVar.e = q0Var3;
                com.google.android.gms.common.internal.i0.e("health_monitor");
                com.google.android.gms.common.internal.i0.b(jMax > 0);
                dVar.f6152b = "health_monitor:start";
                dVar.f6153c = "health_monitor:count";
                dVar.f6154d = "health_monitor:value";
                dVar.f6151a = jMax;
                q0Var3.f11307d = dVar;
                ((a1) q0Var3.f159a).a();
                q0Var3.f11115b = true;
                c0 c0Var2 = a1Var3.H;
                boolean z14 = c0Var2.f11256b;
                a1 a1Var5 = (a1) c0Var2.f159a;
                if (z14) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                String str7 = "";
                Context context2 = a1Var5.f11000a;
                String strB = a1Var5.D;
                String str8 = a1Var5.f11001b;
                i0 i0Var5 = a1Var5.f11007t;
                String packageName = context2.getPackageName();
                Context context3 = a1Var5.f11000a;
                PackageManager packageManager = context3.getPackageManager();
                String str9 = "Unknown";
                String installerPackageName = "unknown";
                try {
                    if (packageManager != null) {
                        q0Var = q0Var3;
                        n1Var = n1Var2;
                        try {
                            installerPackageName = packageManager.getInstallerPackageName(packageName);
                            break;
                        } catch (IllegalArgumentException unused) {
                            a1.f(i0Var5);
                            i0Var5.f11190f.c(i0.k(packageName), "Error retrieving app installer package name. appId");
                        }
                        String str10 = installerPackageName;
                        try {
                            if (str10 != null) {
                                if ("com.android.vending".equals(str10)) {
                                    installerPackageName = "";
                                }
                                packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                                if (packageInfo != null) {
                                    applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (!TextUtils.isEmpty(applicationLabel)) {
                                        string = applicationLabel.toString();
                                    } else {
                                        string = "Unknown";
                                    }
                                    try {
                                        str = packageInfo.versionName;
                                        try {
                                            i = packageInfo.versionCode;
                                            packageManager = packageManager;
                                            str2 = installerPackageName;
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            str9 = str;
                                            a1.f(i0Var5);
                                            i0Var5.f11190f.d(i0.k(packageName), "Error retrieving package info. appId, appName", string);
                                            str = str9;
                                            str2 = installerPackageName;
                                            i = Integer.MIN_VALUE;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                    }
                                    break;
                                }
                                c0Var2.f11047c = packageName;
                                c0Var2.f11049f = str2;
                                c0Var2.f11048d = str;
                                c0Var2.e = i;
                                c0Var2.f11050r = 0L;
                                if (TextUtils.isEmpty(str8) && "am".equals(a1Var5.f11002c)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                iG = a1Var5.g();
                                switch (iG) {
                                    case 0:
                                        a1.f(i0Var5);
                                        i0Var5.f11198y.b("App measurement collection enabled");
                                        break;
                                    case 1:
                                        a1.f(i0Var5);
                                        i0Var5.f11196w.b("App measurement deactivated via the manifest");
                                        break;
                                    case 2:
                                        a1.f(i0Var5);
                                        i0Var5.f11198y.b("App measurement deactivated via the init parameters");
                                        break;
                                    case 3:
                                        a1.f(i0Var5);
                                        i0Var5.f11196w.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                        break;
                                    case 4:
                                        a1.f(i0Var5);
                                        i0Var5.f11196w.b("App measurement disabled via the manifest");
                                        break;
                                    case 5:
                                        a1.f(i0Var5);
                                        i0Var5.f11198y.b("App measurement disabled via the init parameters");
                                        break;
                                    case 6:
                                        a1.f(i0Var5);
                                        i0Var5.f11195v.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                        break;
                                    case 7:
                                        a1.f(i0Var5);
                                        i0Var5.f11196w.b("App measurement disabled via the global data collection setting");
                                        break;
                                    default:
                                        a1.f(i0Var5);
                                        i0Var5.f11196w.b("App measurement disabled due to denied storage consent");
                                        break;
                                }
                                c0Var2.f11055w = "";
                                c0Var2.f11056x = "";
                                if (z4) {
                                    c0Var2.f11056x = str8;
                                }
                                strI = k1.i(context3, strB);
                                if (!TextUtils.isEmpty(strI)) {
                                    str7 = strI;
                                }
                                c0Var2.f11055w = str7;
                                if (!TextUtils.isEmpty(strI)) {
                                    resources = context3.getResources();
                                    if (TextUtils.isEmpty(strB)) {
                                        strB = k1.b(context3);
                                    }
                                    identifier = resources.getIdentifier("admob_app_id", "string", strB);
                                    if (identifier == 0) {
                                        string3 = null;
                                    } else {
                                        try {
                                            string3 = resources.getString(identifier);
                                        } catch (Resources.NotFoundException unused4) {
                                            string3 = null;
                                        }
                                    }
                                    c0Var2.f11056x = string3;
                                    break;
                                }
                                if (iG == 0) {
                                    a1.f(i0Var5);
                                    fd.b bVar3 = i0Var5.f11198y;
                                    String str11 = c0Var2.f11047c;
                                    if (TextUtils.isEmpty(c0Var2.f11055w)) {
                                        str5 = c0Var2.f11056x;
                                    } else {
                                        str5 = c0Var2.f11055w;
                                    }
                                    bVar3.d(str11, "App measurement enabled for app package, google app id", str5);
                                    break;
                                }
                                c0Var2.f11052t = null;
                                z7.g gVar2 = a1Var5.f11005r;
                                a1Var = (a1) gVar2.f159a;
                                com.google.android.gms.common.internal.i0.e("analytics.safelisted_events");
                                bundleJ = gVar2.j();
                                if (bundleJ != null) {
                                    if (bundleJ.containsKey("analytics.safelisted_events")) {
                                        numValueOf = Integer.valueOf(bundleJ.getInt("analytics.safelisted_events"));
                                    }
                                    if (numValueOf != null) {
                                        try {
                                            stringArray = a1Var.f11000a.getResources().getStringArray(numValueOf.intValue());
                                            if (stringArray == null) {
                                                listAsList = Arrays.asList(stringArray);
                                            } else {
                                                listAsList = null;
                                            }
                                        } catch (Resources.NotFoundException e10) {
                                            i0 i0Var6 = a1Var.f11007t;
                                            a1.f(i0Var6);
                                            i0Var6.f11190f.c(e10, "Failed to load string array from metadata: resource not found");
                                        }
                                        break;
                                    } else {
                                        listAsList = null;
                                    }
                                    if (listAsList != null) {
                                        c0Var2.f11052t = listAsList;
                                    } else if (listAsList.isEmpty()) {
                                        a1.f(i0Var5);
                                        i0Var5.f11195v.b("Safelisted event list is empty. Ignoring");
                                    } else {
                                        it = listAsList.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                str4 = (String) it.next();
                                                d3Var = a1Var5.f11010w;
                                                a1.d(d3Var);
                                            } else {
                                                c0Var2.f11052t = listAsList;
                                            }
                                        } while (d3Var.I("safelisted event", str4));
                                    }
                                    if (packageManager != null) {
                                        c0Var2.f11054v = p7.a.b(context3) ? 1 : 0;
                                    } else {
                                        c0Var2.f11054v = 0;
                                    }
                                    a1Var5.a();
                                    c0Var2.f11256b = true;
                                    a1.f(i0Var3);
                                    bVar = i0Var3.f11196w;
                                    gVar.g();
                                    bVar.c(79000L, "App measurement initialized, version");
                                    a1.f(i0Var3);
                                    bVar.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    strG = c0Var.g();
                                    if (TextUtils.isEmpty(a1Var3.f11001b)) {
                                        if (TextUtils.isEmpty(strG)) {
                                            zEquals = false;
                                        } else {
                                            zEquals = a1Var4.f11005r.d("debug.firebase.analytics.app").equals(strG);
                                        }
                                        if (zEquals) {
                                            a1.f(i0Var3);
                                            bVar.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                        } else {
                                            a1.f(i0Var3);
                                            bVar.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG)));
                                        }
                                    }
                                    a1.f(i0Var3);
                                    i0Var3.f11197x.b("Debug-level message logging enabled");
                                    if (a1Var3.P != atomicInteger.get()) {
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.d(Integer.valueOf(a1Var3.P), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                                    }
                                    a1Var3.I = true;
                                    zzcl zzclVar = n1Var.f11278g;
                                    context = a1Var3.f11000a;
                                    j4 = a1Var3.R;
                                    x1Var = a1Var3.A;
                                    a1.f(z0Var3);
                                    z0Var3.c();
                                    a1.d(q0Var);
                                    q0Var2 = q0Var;
                                    q qVar2 = q0Var2.E;
                                    qVar = q0Var2.f11308f;
                                    p0Var = q0Var2.e;
                                    j1VarH = q0Var2.h();
                                    int i10 = j1VarH.f11216b;
                                    Object obj = gVar.f159a;
                                    Boolean boolK2 = gVar.k("google_analytics_default_allow_ad_storage");
                                    boolK = gVar.k("google_analytics_default_allow_analytics_storage");
                                    if ((boolK2 != null && boolK == null) || !q0Var2.l(-10)) {
                                        if (!TextUtils.isEmpty(a1Var3.j().h()) && (i10 == 0 || i10 == 30 || i10 == 10 || i10 == 30 || i10 == 30 || i10 == 40)) {
                                            a1.e(x1Var);
                                            x1Var.p(new j1(null, null, -10), j4);
                                        } else if (TextUtils.isEmpty(a1Var3.j().h()) && zzclVar != null && zzclVar.zzg != null && q0Var2.l(30)) {
                                            j1Var = j1.a(30, zzclVar.zzg);
                                            Iterator it2 = j1Var.f11215a.values().iterator();
                                            do {
                                                if (it2.hasNext()) {
                                                }
                                            } while (((Boolean) it2.next()) == null);
                                        }
                                        j1Var = null;
                                    }
                                    if (j1Var != null) {
                                        a1.e(x1Var);
                                        x1Var.p(j1Var, j4);
                                        j1Var2 = j1Var;
                                    } else {
                                        j1Var2 = j1VarH;
                                    }
                                    a1.e(x1Var);
                                    x1Var.r(j1Var2);
                                    if (p0Var.a() == 0) {
                                        a1.f(i0Var3);
                                        i0Var3.f11198y.c(Long.valueOf(j4), "Persisting first open");
                                        p0Var.b(j4);
                                    }
                                    a1.e(x1Var);
                                    s0Var = x1Var.f11432w;
                                    if (s0Var.c() && s0Var.d()) {
                                        q0 q0Var4 = s0Var.f11339b.f11006s;
                                        a1.d(q0Var4);
                                        q0Var4.F.h(null);
                                    }
                                    if (!a1Var3.c()) {
                                        if (TextUtils.isEmpty(a1Var3.j().h())) {
                                            c0VarJ2 = a1Var3.j();
                                            c0VarJ2.d();
                                            if (!TextUtils.isEmpty(c0VarJ2.f11056x)) {
                                                a1.d(d3Var2);
                                                strH = a1Var3.j().h();
                                                q0Var2.c();
                                                string2 = q0Var2.g().getString("gmp_app_id", null);
                                                c0 c0VarJ3 = a1Var3.j();
                                                c0VarJ3.d();
                                                str3 = c0VarJ3.f11056x;
                                                q0Var2.c();
                                                if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                                    a1.f(i0Var3);
                                                    i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                                    q0Var2.c();
                                                    q0Var2.c();
                                                    if (q0Var2.g().contains("measurement_enabled")) {
                                                        boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                                    } else {
                                                        boolValueOf = null;
                                                    }
                                                    SharedPreferences.Editor editorEdit2 = q0Var2.g().edit();
                                                    editorEdit2.clear();
                                                    editorEdit2.apply();
                                                    if (boolValueOf != null) {
                                                        q0Var2.c();
                                                        SharedPreferences.Editor editorEdit3 = q0Var2.g().edit();
                                                        editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                        editorEdit3.apply();
                                                    }
                                                    a1Var3.k().h();
                                                    a1Var3.F.s();
                                                    a1Var3.F.r();
                                                    p0Var.b(j4);
                                                    qVar.h(null);
                                                }
                                                String strH2 = a1Var3.j().h();
                                                q0Var2.c();
                                                SharedPreferences.Editor editorEdit4 = q0Var2.g().edit();
                                                editorEdit4.putString("gmp_app_id", strH2);
                                                editorEdit4.apply();
                                                c0 c0VarJ4 = a1Var3.j();
                                                c0VarJ4.d();
                                                String str12 = c0VarJ4.f11056x;
                                                q0Var2.c();
                                                SharedPreferences.Editor editorEdit5 = q0Var2.g().edit();
                                                editorEdit5.putString("admob_app_id", str12);
                                                editorEdit5.apply();
                                            }
                                        } else {
                                            a1.d(d3Var2);
                                            strH = a1Var3.j().h();
                                            q0Var2.c();
                                            string2 = q0Var2.g().getString("gmp_app_id", null);
                                            c0 c0VarJ5 = a1Var3.j();
                                            c0VarJ5.d();
                                            str3 = c0VarJ5.f11056x;
                                            q0Var2.c();
                                            if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                                a1.f(i0Var3);
                                                i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                                q0Var2.c();
                                                q0Var2.c();
                                                if (q0Var2.g().contains("measurement_enabled")) {
                                                    boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                SharedPreferences.Editor editorEdit6 = q0Var2.g().edit();
                                                editorEdit6.clear();
                                                editorEdit6.apply();
                                                if (boolValueOf != null) {
                                                    q0Var2.c();
                                                    SharedPreferences.Editor editorEdit7 = q0Var2.g().edit();
                                                    editorEdit7.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit7.apply();
                                                }
                                                a1Var3.k().h();
                                                a1Var3.F.s();
                                                a1Var3.F.r();
                                                p0Var.b(j4);
                                                qVar.h(null);
                                            }
                                            String strH3 = a1Var3.j().h();
                                            q0Var2.c();
                                            SharedPreferences.Editor editorEdit8 = q0Var2.g().edit();
                                            editorEdit8.putString("gmp_app_id", strH3);
                                            editorEdit8.apply();
                                            c0 c0VarJ6 = a1Var3.j();
                                            c0VarJ6.d();
                                            String str13 = c0VarJ6.f11056x;
                                            q0Var2.c();
                                            SharedPreferences.Editor editorEdit9 = q0Var2.g().edit();
                                            editorEdit9.putString("admob_app_id", str13);
                                            editorEdit9.apply();
                                        }
                                        if (!q0Var2.h().f(i1.ANALYTICS_STORAGE)) {
                                            qVar.h(null);
                                        }
                                        a1.e(x1Var);
                                        x1Var.f11427r.set(qVar.g());
                                        zzos.zzc();
                                        if (gVar.l(null, z.f11454d0)) {
                                            a1.d(d3Var2);
                                            try {
                                                ((a1) d3Var2.f159a).f11000a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            } catch (ClassNotFoundException unused5) {
                                                if (!TextUtils.isEmpty(qVar2.g())) {
                                                    a1.f(i0Var3);
                                                    i0Var3.f11193t.b("Remote config removed with active feature rollouts");
                                                    qVar2.h(null);
                                                }
                                            }
                                        }
                                        if (TextUtils.isEmpty(a1Var3.j().h())) {
                                            c0VarJ = a1Var3.j();
                                            c0VarJ.d();
                                            if (!TextUtils.isEmpty(c0VarJ.f11056x)) {
                                                zB = a1Var3.b();
                                                sharedPreferences = q0Var2.f11306c;
                                                if (sharedPreferences == null) {
                                                    zContains = false;
                                                } else {
                                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                }
                                                if (!zContains && !gVar.n()) {
                                                    q0Var2.j(!zB);
                                                }
                                                if (zB) {
                                                    a1.e(x1Var);
                                                    x1Var.z();
                                                }
                                                t2 t2Var = a1Var3.f11009v;
                                                a1.e(t2Var);
                                                t2Var.e.j();
                                                a1Var3.n().t(new AtomicReference());
                                                k2 k2VarN = a1Var3.n();
                                                Bundle bundleG = q0Var2.H.g();
                                                k2VarN.c();
                                                k2VarN.d();
                                                k2VarN.p(new b3.b(k2VarN, k2VarN.m(false), bundleG, 29));
                                            }
                                        } else {
                                            zB = a1Var3.b();
                                            sharedPreferences = q0Var2.f11306c;
                                            if (sharedPreferences == null) {
                                                zContains = false;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                q0Var2.j(!zB);
                                            }
                                            if (zB) {
                                                a1.e(x1Var);
                                                x1Var.z();
                                            }
                                            t2 t2Var2 = a1Var3.f11009v;
                                            a1.e(t2Var2);
                                            t2Var2.e.j();
                                            a1Var3.n().t(new AtomicReference());
                                            k2 k2VarN2 = a1Var3.n();
                                            Bundle bundleG2 = q0Var2.H.g();
                                            k2VarN2.c();
                                            k2VarN2.d();
                                            k2VarN2.p(new b3.b(k2VarN2, k2VarN2.m(false), bundleG2, 29));
                                        }
                                        break;
                                    } else if (a1Var3.b()) {
                                        a1.d(d3Var2);
                                        if (!d3Var2.K("android.permission.INTERNET")) {
                                            a1.f(i0Var3);
                                            i0Var3.f11190f.b("App is missing INTERNET permission");
                                        }
                                        if (!d3Var2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                            a1.f(i0Var3);
                                            i0Var3.f11190f.b("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        if (!p7.c.a(context).h() && !gVar.p()) {
                                            if (!d3.Q(context)) {
                                                a1.f(i0Var3);
                                                i0Var3.f11190f.b("AppMeasurementReceiver not registered/enabled");
                                            }
                                            try {
                                                PackageManager packageManager2 = context.getPackageManager();
                                                z10 = (packageManager2 == null || (serviceInfo = packageManager2.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
                                            } catch (PackageManager.NameNotFoundException unused6) {
                                            }
                                            if (!z10) {
                                                a1.f(i0Var3);
                                                i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.b("Uploading is not possible. App measurement disabled");
                                    }
                                    q0Var2.f11315x.a(true);
                                    return;
                                }
                                i0 i0Var7 = a1Var.f11007t;
                                a1.f(i0Var7);
                                i0Var7.f11190f.b("Failed to load metadata: Metadata bundle is null");
                                numValueOf = null;
                                if (numValueOf != null) {
                                    stringArray = a1Var.f11000a.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                    } else {
                                        listAsList = null;
                                    }
                                    break;
                                } else {
                                    listAsList = null;
                                }
                                if (listAsList != null) {
                                    c0Var2.f11052t = listAsList;
                                } else if (listAsList.isEmpty()) {
                                    a1.f(i0Var5);
                                    i0Var5.f11195v.b("Safelisted event list is empty. Ignoring");
                                } else {
                                    it = listAsList.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            str4 = (String) it.next();
                                            d3Var = a1Var5.f11010w;
                                            a1.d(d3Var);
                                        } else {
                                            c0Var2.f11052t = listAsList;
                                        }
                                    } while (d3Var.I("safelisted event", str4));
                                }
                                if (packageManager != null) {
                                    c0Var2.f11054v = p7.a.b(context3) ? 1 : 0;
                                } else {
                                    c0Var2.f11054v = 0;
                                }
                                a1Var5.a();
                                c0Var2.f11256b = true;
                                a1.f(i0Var3);
                                bVar = i0Var3.f11196w;
                                gVar.g();
                                bVar.c(79000L, "App measurement initialized, version");
                                a1.f(i0Var3);
                                bVar.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                strG = c0Var.g();
                                if (TextUtils.isEmpty(a1Var3.f11001b)) {
                                    if (TextUtils.isEmpty(strG)) {
                                        zEquals = false;
                                    } else {
                                        zEquals = a1Var4.f11005r.d("debug.firebase.analytics.app").equals(strG);
                                    }
                                    if (zEquals) {
                                        a1.f(i0Var3);
                                        bVar.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
                                        a1.f(i0Var3);
                                        bVar.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG)));
                                    }
                                }
                                a1.f(i0Var3);
                                i0Var3.f11197x.b("Debug-level message logging enabled");
                                if (a1Var3.P != atomicInteger.get()) {
                                    a1.f(i0Var3);
                                    i0Var3.f11190f.d(Integer.valueOf(a1Var3.P), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                                }
                                a1Var3.I = true;
                                zzcl zzclVar2 = n1Var.f11278g;
                                context = a1Var3.f11000a;
                                j4 = a1Var3.R;
                                x1Var = a1Var3.A;
                                a1.f(z0Var3);
                                z0Var3.c();
                                a1.d(q0Var);
                                q0Var2 = q0Var;
                                q qVar3 = q0Var2.E;
                                qVar = q0Var2.f11308f;
                                p0Var = q0Var2.e;
                                j1VarH = q0Var2.h();
                                int i11 = j1VarH.f11216b;
                                Object obj2 = gVar.f159a;
                                Boolean boolK3 = gVar.k("google_analytics_default_allow_ad_storage");
                                boolK = gVar.k("google_analytics_default_allow_analytics_storage");
                                j1Var = boolK3 != null ? new j1(boolK3, boolK, -10) : new j1(boolK3, boolK, -10);
                                if (j1Var != null) {
                                    a1.e(x1Var);
                                    x1Var.p(j1Var, j4);
                                    j1Var2 = j1Var;
                                } else {
                                    j1Var2 = j1VarH;
                                }
                                a1.e(x1Var);
                                x1Var.r(j1Var2);
                                if (p0Var.a() == 0) {
                                    a1.f(i0Var3);
                                    i0Var3.f11198y.c(Long.valueOf(j4), "Persisting first open");
                                    p0Var.b(j4);
                                }
                                a1.e(x1Var);
                                s0Var = x1Var.f11432w;
                                if (s0Var.c()) {
                                    q0 q0Var5 = s0Var.f11339b.f11006s;
                                    a1.d(q0Var5);
                                    q0Var5.F.h(null);
                                }
                                if (!a1Var3.c()) {
                                    if (TextUtils.isEmpty(a1Var3.j().h())) {
                                        c0VarJ2 = a1Var3.j();
                                        c0VarJ2.d();
                                        if (!TextUtils.isEmpty(c0VarJ2.f11056x)) {
                                            a1.d(d3Var2);
                                            strH = a1Var3.j().h();
                                            q0Var2.c();
                                            string2 = q0Var2.g().getString("gmp_app_id", null);
                                            c0 c0VarJ7 = a1Var3.j();
                                            c0VarJ7.d();
                                            str3 = c0VarJ7.f11056x;
                                            q0Var2.c();
                                            if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                                a1.f(i0Var3);
                                                i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                                q0Var2.c();
                                                q0Var2.c();
                                                if (q0Var2.g().contains("measurement_enabled")) {
                                                    boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                SharedPreferences.Editor editorEdit10 = q0Var2.g().edit();
                                                editorEdit10.clear();
                                                editorEdit10.apply();
                                                if (boolValueOf != null) {
                                                    q0Var2.c();
                                                    SharedPreferences.Editor editorEdit11 = q0Var2.g().edit();
                                                    editorEdit11.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit11.apply();
                                                }
                                                a1Var3.k().h();
                                                a1Var3.F.s();
                                                a1Var3.F.r();
                                                p0Var.b(j4);
                                                qVar.h(null);
                                            }
                                            String strH4 = a1Var3.j().h();
                                            q0Var2.c();
                                            SharedPreferences.Editor editorEdit12 = q0Var2.g().edit();
                                            editorEdit12.putString("gmp_app_id", strH4);
                                            editorEdit12.apply();
                                            c0 c0VarJ8 = a1Var3.j();
                                            c0VarJ8.d();
                                            String str14 = c0VarJ8.f11056x;
                                            q0Var2.c();
                                            SharedPreferences.Editor editorEdit13 = q0Var2.g().edit();
                                            editorEdit13.putString("admob_app_id", str14);
                                            editorEdit13.apply();
                                        }
                                    } else {
                                        a1.d(d3Var2);
                                        strH = a1Var3.j().h();
                                        q0Var2.c();
                                        string2 = q0Var2.g().getString("gmp_app_id", null);
                                        c0 c0VarJ9 = a1Var3.j();
                                        c0VarJ9.d();
                                        str3 = c0VarJ9.f11056x;
                                        q0Var2.c();
                                        if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                            a1.f(i0Var3);
                                            i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                            q0Var2.c();
                                            q0Var2.c();
                                            if (q0Var2.g().contains("measurement_enabled")) {
                                                boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                            } else {
                                                boolValueOf = null;
                                            }
                                            SharedPreferences.Editor editorEdit14 = q0Var2.g().edit();
                                            editorEdit14.clear();
                                            editorEdit14.apply();
                                            if (boolValueOf != null) {
                                                q0Var2.c();
                                                SharedPreferences.Editor editorEdit15 = q0Var2.g().edit();
                                                editorEdit15.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                editorEdit15.apply();
                                            }
                                            a1Var3.k().h();
                                            a1Var3.F.s();
                                            a1Var3.F.r();
                                            p0Var.b(j4);
                                            qVar.h(null);
                                        }
                                        String strH5 = a1Var3.j().h();
                                        q0Var2.c();
                                        SharedPreferences.Editor editorEdit16 = q0Var2.g().edit();
                                        editorEdit16.putString("gmp_app_id", strH5);
                                        editorEdit16.apply();
                                        c0 c0VarJ10 = a1Var3.j();
                                        c0VarJ10.d();
                                        String str15 = c0VarJ10.f11056x;
                                        q0Var2.c();
                                        SharedPreferences.Editor editorEdit17 = q0Var2.g().edit();
                                        editorEdit17.putString("admob_app_id", str15);
                                        editorEdit17.apply();
                                    }
                                    if (!q0Var2.h().f(i1.ANALYTICS_STORAGE)) {
                                        qVar.h(null);
                                    }
                                    a1.e(x1Var);
                                    x1Var.f11427r.set(qVar.g());
                                    zzos.zzc();
                                    if (gVar.l(null, z.f11454d0)) {
                                        a1.d(d3Var2);
                                        ((a1) d3Var2.f159a).f11000a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    }
                                    if (TextUtils.isEmpty(a1Var3.j().h())) {
                                        c0VarJ = a1Var3.j();
                                        c0VarJ.d();
                                        if (!TextUtils.isEmpty(c0VarJ.f11056x)) {
                                            zB = a1Var3.b();
                                            sharedPreferences = q0Var2.f11306c;
                                            if (sharedPreferences == null) {
                                                zContains = false;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                q0Var2.j(!zB);
                                            }
                                            if (zB) {
                                                a1.e(x1Var);
                                                x1Var.z();
                                            }
                                            t2 t2Var3 = a1Var3.f11009v;
                                            a1.e(t2Var3);
                                            t2Var3.e.j();
                                            a1Var3.n().t(new AtomicReference());
                                            k2 k2VarN3 = a1Var3.n();
                                            Bundle bundleG3 = q0Var2.H.g();
                                            k2VarN3.c();
                                            k2VarN3.d();
                                            k2VarN3.p(new b3.b(k2VarN3, k2VarN3.m(false), bundleG3, 29));
                                        }
                                    } else {
                                        zB = a1Var3.b();
                                        sharedPreferences = q0Var2.f11306c;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            q0Var2.j(!zB);
                                        }
                                        if (zB) {
                                            a1.e(x1Var);
                                            x1Var.z();
                                        }
                                        t2 t2Var4 = a1Var3.f11009v;
                                        a1.e(t2Var4);
                                        t2Var4.e.j();
                                        a1Var3.n().t(new AtomicReference());
                                        k2 k2VarN4 = a1Var3.n();
                                        Bundle bundleG4 = q0Var2.H.g();
                                        k2VarN4.c();
                                        k2VarN4.d();
                                        k2VarN4.p(new b3.b(k2VarN4, k2VarN4.m(false), bundleG4, 29));
                                    }
                                    break;
                                } else if (a1Var3.b()) {
                                    a1.d(d3Var2);
                                    if (!d3Var2.K("android.permission.INTERNET")) {
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.b("App is missing INTERNET permission");
                                    }
                                    if (!d3Var2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.b("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    if (!p7.c.a(context).h()) {
                                        if (!d3.Q(context)) {
                                            a1.f(i0Var3);
                                            i0Var3.f11190f.b("AppMeasurementReceiver not registered/enabled");
                                        }
                                        PackageManager packageManager3 = context.getPackageManager();
                                        if (packageManager3 == null) {
                                            if (!z10) {
                                                a1.f(i0Var3);
                                                i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        if (!z10) {
                                            a1.f(i0Var3);
                                            i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    a1.f(i0Var3);
                                    i0Var3.f11190f.b("Uploading is not possible. App measurement disabled");
                                }
                                q0Var2.f11315x.a(true);
                                return;
                            }
                            str10 = "manual_install";
                            packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                            if (packageInfo != null) {
                                applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    string = applicationLabel.toString();
                                } else {
                                    string = "Unknown";
                                }
                                str = packageInfo.versionName;
                                i = packageInfo.versionCode;
                                packageManager = packageManager;
                                str2 = installerPackageName;
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused7) {
                            string = "Unknown";
                        }
                        installerPackageName = str10;
                        c0Var2.f11047c = packageName;
                        c0Var2.f11049f = str2;
                        c0Var2.f11048d = str;
                        c0Var2.e = i;
                        c0Var2.f11050r = 0L;
                        if (TextUtils.isEmpty(str8)) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        iG = a1Var5.g();
                        switch (iG) {
                            case 0:
                                a1.f(i0Var5);
                                i0Var5.f11198y.b("App measurement collection enabled");
                                break;
                            case 1:
                                a1.f(i0Var5);
                                i0Var5.f11196w.b("App measurement deactivated via the manifest");
                                break;
                            case 2:
                                a1.f(i0Var5);
                                i0Var5.f11198y.b("App measurement deactivated via the init parameters");
                                break;
                            case 3:
                                a1.f(i0Var5);
                                i0Var5.f11196w.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                break;
                            case 4:
                                a1.f(i0Var5);
                                i0Var5.f11196w.b("App measurement disabled via the manifest");
                                break;
                            case 5:
                                a1.f(i0Var5);
                                i0Var5.f11198y.b("App measurement disabled via the init parameters");
                                break;
                            case 6:
                                a1.f(i0Var5);
                                i0Var5.f11195v.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                break;
                            case 7:
                                a1.f(i0Var5);
                                i0Var5.f11196w.b("App measurement disabled via the global data collection setting");
                                break;
                            default:
                                a1.f(i0Var5);
                                i0Var5.f11196w.b("App measurement disabled due to denied storage consent");
                                break;
                        }
                        c0Var2.f11055w = "";
                        c0Var2.f11056x = "";
                        if (z4) {
                            c0Var2.f11056x = str8;
                        }
                        strI = k1.i(context3, strB);
                        if (!TextUtils.isEmpty(strI)) {
                            str7 = strI;
                        }
                        c0Var2.f11055w = str7;
                        if (!TextUtils.isEmpty(strI)) {
                            resources = context3.getResources();
                            if (TextUtils.isEmpty(strB)) {
                                strB = k1.b(context3);
                            }
                            identifier = resources.getIdentifier("admob_app_id", "string", strB);
                            if (identifier == 0) {
                                string3 = resources.getString(identifier);
                            } else {
                                string3 = null;
                            }
                            c0Var2.f11056x = string3;
                            break;
                        }
                        if (iG == 0) {
                            a1.f(i0Var5);
                            fd.b bVar4 = i0Var5.f11198y;
                            String str16 = c0Var2.f11047c;
                            if (TextUtils.isEmpty(c0Var2.f11055w)) {
                                str5 = c0Var2.f11056x;
                            } else {
                                str5 = c0Var2.f11055w;
                            }
                            bVar4.d(str16, "App measurement enabled for app package, google app id", str5);
                            break;
                        }
                        c0Var2.f11052t = null;
                        z7.g gVar3 = a1Var5.f11005r;
                        a1Var = (a1) gVar3.f159a;
                        com.google.android.gms.common.internal.i0.e("analytics.safelisted_events");
                        bundleJ = gVar3.j();
                        if (bundleJ != null) {
                            if (bundleJ.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleJ.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                stringArray = a1Var.f11000a.getResources().getStringArray(numValueOf.intValue());
                                if (stringArray == null) {
                                    listAsList = Arrays.asList(stringArray);
                                } else {
                                    listAsList = null;
                                }
                                break;
                            } else {
                                listAsList = null;
                            }
                            if (listAsList != null) {
                                c0Var2.f11052t = listAsList;
                            } else if (listAsList.isEmpty()) {
                                a1.f(i0Var5);
                                i0Var5.f11195v.b("Safelisted event list is empty. Ignoring");
                            } else {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        str4 = (String) it.next();
                                        d3Var = a1Var5.f11010w;
                                        a1.d(d3Var);
                                    } else {
                                        c0Var2.f11052t = listAsList;
                                    }
                                } while (d3Var.I("safelisted event", str4));
                            }
                            if (packageManager != null) {
                                c0Var2.f11054v = p7.a.b(context3) ? 1 : 0;
                            } else {
                                c0Var2.f11054v = 0;
                            }
                            a1Var5.a();
                            c0Var2.f11256b = true;
                            a1.f(i0Var3);
                            bVar = i0Var3.f11196w;
                            gVar.g();
                            bVar.c(79000L, "App measurement initialized, version");
                            a1.f(i0Var3);
                            bVar.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strG = c0Var.g();
                            if (TextUtils.isEmpty(a1Var3.f11001b)) {
                                if (TextUtils.isEmpty(strG)) {
                                    zEquals = false;
                                } else {
                                    zEquals = a1Var4.f11005r.d("debug.firebase.analytics.app").equals(strG);
                                }
                                if (zEquals) {
                                    a1.f(i0Var3);
                                    bVar.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
                                    a1.f(i0Var3);
                                    bVar.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG)));
                                }
                            }
                            a1.f(i0Var3);
                            i0Var3.f11197x.b("Debug-level message logging enabled");
                            if (a1Var3.P != atomicInteger.get()) {
                                a1.f(i0Var3);
                                i0Var3.f11190f.d(Integer.valueOf(a1Var3.P), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                            }
                            a1Var3.I = true;
                            zzcl zzclVar3 = n1Var.f11278g;
                            context = a1Var3.f11000a;
                            j4 = a1Var3.R;
                            x1Var = a1Var3.A;
                            a1.f(z0Var3);
                            z0Var3.c();
                            a1.d(q0Var);
                            q0Var2 = q0Var;
                            q qVar4 = q0Var2.E;
                            qVar = q0Var2.f11308f;
                            p0Var = q0Var2.e;
                            j1VarH = q0Var2.h();
                            int i12 = j1VarH.f11216b;
                            Object obj3 = gVar.f159a;
                            Boolean boolK4 = gVar.k("google_analytics_default_allow_ad_storage");
                            boolK = gVar.k("google_analytics_default_allow_analytics_storage");
                            if (boolK4 != null) {
                            }
                            if (j1Var != null) {
                                a1.e(x1Var);
                                x1Var.p(j1Var, j4);
                                j1Var2 = j1Var;
                            } else {
                                j1Var2 = j1VarH;
                            }
                            a1.e(x1Var);
                            x1Var.r(j1Var2);
                            if (p0Var.a() == 0) {
                                a1.f(i0Var3);
                                i0Var3.f11198y.c(Long.valueOf(j4), "Persisting first open");
                                p0Var.b(j4);
                            }
                            a1.e(x1Var);
                            s0Var = x1Var.f11432w;
                            if (s0Var.c()) {
                                q0 q0Var6 = s0Var.f11339b.f11006s;
                                a1.d(q0Var6);
                                q0Var6.F.h(null);
                            }
                            if (!a1Var3.c()) {
                                if (TextUtils.isEmpty(a1Var3.j().h())) {
                                    c0VarJ2 = a1Var3.j();
                                    c0VarJ2.d();
                                    if (!TextUtils.isEmpty(c0VarJ2.f11056x)) {
                                        a1.d(d3Var2);
                                        strH = a1Var3.j().h();
                                        q0Var2.c();
                                        string2 = q0Var2.g().getString("gmp_app_id", null);
                                        c0 c0VarJ11 = a1Var3.j();
                                        c0VarJ11.d();
                                        str3 = c0VarJ11.f11056x;
                                        q0Var2.c();
                                        if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                            a1.f(i0Var3);
                                            i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                            q0Var2.c();
                                            q0Var2.c();
                                            if (q0Var2.g().contains("measurement_enabled")) {
                                                boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                            } else {
                                                boolValueOf = null;
                                            }
                                            SharedPreferences.Editor editorEdit18 = q0Var2.g().edit();
                                            editorEdit18.clear();
                                            editorEdit18.apply();
                                            if (boolValueOf != null) {
                                                q0Var2.c();
                                                SharedPreferences.Editor editorEdit19 = q0Var2.g().edit();
                                                editorEdit19.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                editorEdit19.apply();
                                            }
                                            a1Var3.k().h();
                                            a1Var3.F.s();
                                            a1Var3.F.r();
                                            p0Var.b(j4);
                                            qVar.h(null);
                                        }
                                        String strH6 = a1Var3.j().h();
                                        q0Var2.c();
                                        SharedPreferences.Editor editorEdit110 = q0Var2.g().edit();
                                        editorEdit110.putString("gmp_app_id", strH6);
                                        editorEdit110.apply();
                                        c0 c0VarJ12 = a1Var3.j();
                                        c0VarJ12.d();
                                        String str17 = c0VarJ12.f11056x;
                                        q0Var2.c();
                                        SharedPreferences.Editor editorEdit111 = q0Var2.g().edit();
                                        editorEdit111.putString("admob_app_id", str17);
                                        editorEdit111.apply();
                                    }
                                } else {
                                    a1.d(d3Var2);
                                    strH = a1Var3.j().h();
                                    q0Var2.c();
                                    string2 = q0Var2.g().getString("gmp_app_id", null);
                                    c0 c0VarJ13 = a1Var3.j();
                                    c0VarJ13.d();
                                    str3 = c0VarJ13.f11056x;
                                    q0Var2.c();
                                    if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                        a1.f(i0Var3);
                                        i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                        q0Var2.c();
                                        q0Var2.c();
                                        if (q0Var2.g().contains("measurement_enabled")) {
                                            boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                        } else {
                                            boolValueOf = null;
                                        }
                                        SharedPreferences.Editor editorEdit112 = q0Var2.g().edit();
                                        editorEdit112.clear();
                                        editorEdit112.apply();
                                        if (boolValueOf != null) {
                                            q0Var2.c();
                                            SharedPreferences.Editor editorEdit113 = q0Var2.g().edit();
                                            editorEdit113.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                            editorEdit113.apply();
                                        }
                                        a1Var3.k().h();
                                        a1Var3.F.s();
                                        a1Var3.F.r();
                                        p0Var.b(j4);
                                        qVar.h(null);
                                    }
                                    String strH7 = a1Var3.j().h();
                                    q0Var2.c();
                                    SharedPreferences.Editor editorEdit114 = q0Var2.g().edit();
                                    editorEdit114.putString("gmp_app_id", strH7);
                                    editorEdit114.apply();
                                    c0 c0VarJ14 = a1Var3.j();
                                    c0VarJ14.d();
                                    String str18 = c0VarJ14.f11056x;
                                    q0Var2.c();
                                    SharedPreferences.Editor editorEdit115 = q0Var2.g().edit();
                                    editorEdit115.putString("admob_app_id", str18);
                                    editorEdit115.apply();
                                }
                                if (!q0Var2.h().f(i1.ANALYTICS_STORAGE)) {
                                    qVar.h(null);
                                }
                                a1.e(x1Var);
                                x1Var.f11427r.set(qVar.g());
                                zzos.zzc();
                                if (gVar.l(null, z.f11454d0)) {
                                    a1.d(d3Var2);
                                    ((a1) d3Var2.f159a).f11000a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                }
                                if (TextUtils.isEmpty(a1Var3.j().h())) {
                                    c0VarJ = a1Var3.j();
                                    c0VarJ.d();
                                    if (!TextUtils.isEmpty(c0VarJ.f11056x)) {
                                        zB = a1Var3.b();
                                        sharedPreferences = q0Var2.f11306c;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            q0Var2.j(!zB);
                                        }
                                        if (zB) {
                                            a1.e(x1Var);
                                            x1Var.z();
                                        }
                                        t2 t2Var5 = a1Var3.f11009v;
                                        a1.e(t2Var5);
                                        t2Var5.e.j();
                                        a1Var3.n().t(new AtomicReference());
                                        k2 k2VarN5 = a1Var3.n();
                                        Bundle bundleG5 = q0Var2.H.g();
                                        k2VarN5.c();
                                        k2VarN5.d();
                                        k2VarN5.p(new b3.b(k2VarN5, k2VarN5.m(false), bundleG5, 29));
                                    }
                                } else {
                                    zB = a1Var3.b();
                                    sharedPreferences = q0Var2.f11306c;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        q0Var2.j(!zB);
                                    }
                                    if (zB) {
                                        a1.e(x1Var);
                                        x1Var.z();
                                    }
                                    t2 t2Var6 = a1Var3.f11009v;
                                    a1.e(t2Var6);
                                    t2Var6.e.j();
                                    a1Var3.n().t(new AtomicReference());
                                    k2 k2VarN6 = a1Var3.n();
                                    Bundle bundleG6 = q0Var2.H.g();
                                    k2VarN6.c();
                                    k2VarN6.d();
                                    k2VarN6.p(new b3.b(k2VarN6, k2VarN6.m(false), bundleG6, 29));
                                }
                                break;
                            } else if (a1Var3.b()) {
                                a1.d(d3Var2);
                                if (!d3Var2.K("android.permission.INTERNET")) {
                                    a1.f(i0Var3);
                                    i0Var3.f11190f.b("App is missing INTERNET permission");
                                }
                                if (!d3Var2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                    a1.f(i0Var3);
                                    i0Var3.f11190f.b("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                if (!p7.c.a(context).h()) {
                                    if (!d3.Q(context)) {
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.b("AppMeasurementReceiver not registered/enabled");
                                    }
                                    PackageManager packageManager4 = context.getPackageManager();
                                    if (packageManager4 == null) {
                                        if (!z10) {
                                            a1.f(i0Var3);
                                            i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    if (!z10) {
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                                    }
                                }
                                a1.f(i0Var3);
                                i0Var3.f11190f.b("Uploading is not possible. App measurement disabled");
                            }
                            q0Var2.f11315x.a(true);
                            return;
                        }
                        i0 i0Var8 = a1Var.f11007t;
                        a1.f(i0Var8);
                        i0Var8.f11190f.b("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = a1Var.f11000a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            } else {
                                listAsList = null;
                            }
                            break;
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            c0Var2.f11052t = listAsList;
                        } else if (listAsList.isEmpty()) {
                            a1.f(i0Var5);
                            i0Var5.f11195v.b("Safelisted event list is empty. Ignoring");
                        } else {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    str4 = (String) it.next();
                                    d3Var = a1Var5.f11010w;
                                    a1.d(d3Var);
                                } else {
                                    c0Var2.f11052t = listAsList;
                                }
                            } while (d3Var.I("safelisted event", str4));
                        }
                        if (packageManager != null) {
                            c0Var2.f11054v = p7.a.b(context3) ? 1 : 0;
                        } else {
                            c0Var2.f11054v = 0;
                        }
                        a1Var5.a();
                        c0Var2.f11256b = true;
                        a1.f(i0Var3);
                        bVar = i0Var3.f11196w;
                        gVar.g();
                        bVar.c(79000L, "App measurement initialized, version");
                        a1.f(i0Var3);
                        bVar.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strG = c0Var.g();
                        if (TextUtils.isEmpty(a1Var3.f11001b)) {
                            if (TextUtils.isEmpty(strG)) {
                                zEquals = false;
                            } else {
                                zEquals = a1Var4.f11005r.d("debug.firebase.analytics.app").equals(strG);
                            }
                            if (zEquals) {
                                a1.f(i0Var3);
                                bVar.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                a1.f(i0Var3);
                                bVar.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG)));
                            }
                        }
                        a1.f(i0Var3);
                        i0Var3.f11197x.b("Debug-level message logging enabled");
                        if (a1Var3.P != atomicInteger.get()) {
                            a1.f(i0Var3);
                            i0Var3.f11190f.d(Integer.valueOf(a1Var3.P), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                        }
                        a1Var3.I = true;
                        zzcl zzclVar4 = n1Var.f11278g;
                        context = a1Var3.f11000a;
                        j4 = a1Var3.R;
                        x1Var = a1Var3.A;
                        a1.f(z0Var3);
                        z0Var3.c();
                        a1.d(q0Var);
                        q0Var2 = q0Var;
                        q qVar5 = q0Var2.E;
                        qVar = q0Var2.f11308f;
                        p0Var = q0Var2.e;
                        j1VarH = q0Var2.h();
                        int i13 = j1VarH.f11216b;
                        Object obj4 = gVar.f159a;
                        Boolean boolK5 = gVar.k("google_analytics_default_allow_ad_storage");
                        boolK = gVar.k("google_analytics_default_allow_analytics_storage");
                        if (boolK5 != null) {
                        }
                        if (j1Var != null) {
                            a1.e(x1Var);
                            x1Var.p(j1Var, j4);
                            j1Var2 = j1Var;
                        } else {
                            j1Var2 = j1VarH;
                        }
                        a1.e(x1Var);
                        x1Var.r(j1Var2);
                        if (p0Var.a() == 0) {
                            a1.f(i0Var3);
                            i0Var3.f11198y.c(Long.valueOf(j4), "Persisting first open");
                            p0Var.b(j4);
                        }
                        a1.e(x1Var);
                        s0Var = x1Var.f11432w;
                        if (s0Var.c()) {
                            q0 q0Var7 = s0Var.f11339b.f11006s;
                            a1.d(q0Var7);
                            q0Var7.F.h(null);
                        }
                        if (!a1Var3.c()) {
                            if (TextUtils.isEmpty(a1Var3.j().h())) {
                                c0VarJ2 = a1Var3.j();
                                c0VarJ2.d();
                                if (!TextUtils.isEmpty(c0VarJ2.f11056x)) {
                                    a1.d(d3Var2);
                                    strH = a1Var3.j().h();
                                    q0Var2.c();
                                    string2 = q0Var2.g().getString("gmp_app_id", null);
                                    c0 c0VarJ15 = a1Var3.j();
                                    c0VarJ15.d();
                                    str3 = c0VarJ15.f11056x;
                                    q0Var2.c();
                                    if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                        a1.f(i0Var3);
                                        i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                        q0Var2.c();
                                        q0Var2.c();
                                        if (q0Var2.g().contains("measurement_enabled")) {
                                            boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                        } else {
                                            boolValueOf = null;
                                        }
                                        SharedPreferences.Editor editorEdit116 = q0Var2.g().edit();
                                        editorEdit116.clear();
                                        editorEdit116.apply();
                                        if (boolValueOf != null) {
                                            q0Var2.c();
                                            SharedPreferences.Editor editorEdit117 = q0Var2.g().edit();
                                            editorEdit117.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                            editorEdit117.apply();
                                        }
                                        a1Var3.k().h();
                                        a1Var3.F.s();
                                        a1Var3.F.r();
                                        p0Var.b(j4);
                                        qVar.h(null);
                                    }
                                    String strH8 = a1Var3.j().h();
                                    q0Var2.c();
                                    SharedPreferences.Editor editorEdit118 = q0Var2.g().edit();
                                    editorEdit118.putString("gmp_app_id", strH8);
                                    editorEdit118.apply();
                                    c0 c0VarJ16 = a1Var3.j();
                                    c0VarJ16.d();
                                    String str19 = c0VarJ16.f11056x;
                                    q0Var2.c();
                                    SharedPreferences.Editor editorEdit119 = q0Var2.g().edit();
                                    editorEdit119.putString("admob_app_id", str19);
                                    editorEdit119.apply();
                                }
                            } else {
                                a1.d(d3Var2);
                                strH = a1Var3.j().h();
                                q0Var2.c();
                                string2 = q0Var2.g().getString("gmp_app_id", null);
                                c0 c0VarJ17 = a1Var3.j();
                                c0VarJ17.d();
                                str3 = c0VarJ17.f11056x;
                                q0Var2.c();
                                if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                    a1.f(i0Var3);
                                    i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                    q0Var2.c();
                                    q0Var2.c();
                                    if (q0Var2.g().contains("measurement_enabled")) {
                                        boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                    } else {
                                        boolValueOf = null;
                                    }
                                    SharedPreferences.Editor editorEdit1110 = q0Var2.g().edit();
                                    editorEdit1110.clear();
                                    editorEdit1110.apply();
                                    if (boolValueOf != null) {
                                        q0Var2.c();
                                        SharedPreferences.Editor editorEdit1111 = q0Var2.g().edit();
                                        editorEdit1111.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                        editorEdit1111.apply();
                                    }
                                    a1Var3.k().h();
                                    a1Var3.F.s();
                                    a1Var3.F.r();
                                    p0Var.b(j4);
                                    qVar.h(null);
                                }
                                String strH9 = a1Var3.j().h();
                                q0Var2.c();
                                SharedPreferences.Editor editorEdit1112 = q0Var2.g().edit();
                                editorEdit1112.putString("gmp_app_id", strH9);
                                editorEdit1112.apply();
                                c0 c0VarJ18 = a1Var3.j();
                                c0VarJ18.d();
                                String str110 = c0VarJ18.f11056x;
                                q0Var2.c();
                                SharedPreferences.Editor editorEdit1113 = q0Var2.g().edit();
                                editorEdit1113.putString("admob_app_id", str110);
                                editorEdit1113.apply();
                            }
                            if (!q0Var2.h().f(i1.ANALYTICS_STORAGE)) {
                                qVar.h(null);
                            }
                            a1.e(x1Var);
                            x1Var.f11427r.set(qVar.g());
                            zzos.zzc();
                            if (gVar.l(null, z.f11454d0)) {
                                a1.d(d3Var2);
                                ((a1) d3Var2.f159a).f11000a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            }
                            if (TextUtils.isEmpty(a1Var3.j().h())) {
                                c0VarJ = a1Var3.j();
                                c0VarJ.d();
                                if (!TextUtils.isEmpty(c0VarJ.f11056x)) {
                                    zB = a1Var3.b();
                                    sharedPreferences = q0Var2.f11306c;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        q0Var2.j(!zB);
                                    }
                                    if (zB) {
                                        a1.e(x1Var);
                                        x1Var.z();
                                    }
                                    t2 t2Var7 = a1Var3.f11009v;
                                    a1.e(t2Var7);
                                    t2Var7.e.j();
                                    a1Var3.n().t(new AtomicReference());
                                    k2 k2VarN7 = a1Var3.n();
                                    Bundle bundleG7 = q0Var2.H.g();
                                    k2VarN7.c();
                                    k2VarN7.d();
                                    k2VarN7.p(new b3.b(k2VarN7, k2VarN7.m(false), bundleG7, 29));
                                }
                            } else {
                                zB = a1Var3.b();
                                sharedPreferences = q0Var2.f11306c;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    q0Var2.j(!zB);
                                }
                                if (zB) {
                                    a1.e(x1Var);
                                    x1Var.z();
                                }
                                t2 t2Var8 = a1Var3.f11009v;
                                a1.e(t2Var8);
                                t2Var8.e.j();
                                a1Var3.n().t(new AtomicReference());
                                k2 k2VarN8 = a1Var3.n();
                                Bundle bundleG8 = q0Var2.H.g();
                                k2VarN8.c();
                                k2VarN8.d();
                                k2VarN8.p(new b3.b(k2VarN8, k2VarN8.m(false), bundleG8, 29));
                            }
                            break;
                        } else if (a1Var3.b()) {
                            a1.d(d3Var2);
                            if (!d3Var2.K("android.permission.INTERNET")) {
                                a1.f(i0Var3);
                                i0Var3.f11190f.b("App is missing INTERNET permission");
                            }
                            if (!d3Var2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                a1.f(i0Var3);
                                i0Var3.f11190f.b("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            if (!p7.c.a(context).h()) {
                                if (!d3.Q(context)) {
                                    a1.f(i0Var3);
                                    i0Var3.f11190f.b("AppMeasurementReceiver not registered/enabled");
                                }
                                PackageManager packageManager5 = context.getPackageManager();
                                if (packageManager5 == null) {
                                    if (!z10) {
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                                    }
                                }
                                if (!z10) {
                                    a1.f(i0Var3);
                                    i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                                }
                            }
                            a1.f(i0Var3);
                            i0Var3.f11190f.b("Uploading is not possible. App measurement disabled");
                        }
                        q0Var2.f11315x.a(true);
                        return;
                    }
                    a1.f(i0Var5);
                    q0Var = q0Var3;
                    n1Var = n1Var2;
                    i0Var5.f11190f.c(i0.k(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    strI = k1.i(context3, strB);
                    if (!TextUtils.isEmpty(strI)) {
                        str7 = strI;
                    }
                    c0Var2.f11055w = str7;
                    if (!TextUtils.isEmpty(strI)) {
                        resources = context3.getResources();
                        if (TextUtils.isEmpty(strB)) {
                            strB = k1.b(context3);
                        }
                        identifier = resources.getIdentifier("admob_app_id", "string", strB);
                        if (identifier == 0) {
                            string3 = resources.getString(identifier);
                        } else {
                            string3 = null;
                        }
                        c0Var2.f11056x = string3;
                    }
                    if (iG == 0) {
                        a1.f(i0Var5);
                        fd.b bVar5 = i0Var5.f11198y;
                        String str111 = c0Var2.f11047c;
                        if (TextUtils.isEmpty(c0Var2.f11055w)) {
                            str5 = c0Var2.f11056x;
                        } else {
                            str5 = c0Var2.f11055w;
                        }
                        bVar5.d(str111, "App measurement enabled for app package, google app id", str5);
                    }
                    break;
                } catch (IllegalStateException e11) {
                    a1.f(i0Var5);
                    i0Var5.f11190f.d(i0.k(packageName), "Fetching Google App Id failed with exception. appId", e11);
                }
                str = str9;
                str2 = installerPackageName;
                i = Integer.MIN_VALUE;
                c0Var2.f11047c = packageName;
                c0Var2.f11049f = str2;
                c0Var2.f11048d = str;
                c0Var2.e = i;
                c0Var2.f11050r = 0L;
                if (TextUtils.isEmpty(str8)) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                iG = a1Var5.g();
                switch (iG) {
                    case 0:
                        a1.f(i0Var5);
                        i0Var5.f11198y.b("App measurement collection enabled");
                        break;
                    case 1:
                        a1.f(i0Var5);
                        i0Var5.f11196w.b("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        a1.f(i0Var5);
                        i0Var5.f11198y.b("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        a1.f(i0Var5);
                        i0Var5.f11196w.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        a1.f(i0Var5);
                        i0Var5.f11196w.b("App measurement disabled via the manifest");
                        break;
                    case 5:
                        a1.f(i0Var5);
                        i0Var5.f11198y.b("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        a1.f(i0Var5);
                        i0Var5.f11195v.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        a1.f(i0Var5);
                        i0Var5.f11196w.b("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        a1.f(i0Var5);
                        i0Var5.f11196w.b("App measurement disabled due to denied storage consent");
                        break;
                }
                c0Var2.f11055w = "";
                c0Var2.f11056x = "";
                if (z4) {
                    c0Var2.f11056x = str8;
                }
                c0Var2.f11052t = null;
                z7.g gVar4 = a1Var5.f11005r;
                a1Var = (a1) gVar4.f159a;
                com.google.android.gms.common.internal.i0.e("analytics.safelisted_events");
                bundleJ = gVar4.j();
                if (bundleJ != null) {
                    if (bundleJ.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleJ.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = a1Var.f11000a.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                        } else {
                            listAsList = null;
                        }
                        break;
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        c0Var2.f11052t = listAsList;
                    } else if (listAsList.isEmpty()) {
                        a1.f(i0Var5);
                        i0Var5.f11195v.b("Safelisted event list is empty. Ignoring");
                    } else {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                str4 = (String) it.next();
                                d3Var = a1Var5.f11010w;
                                a1.d(d3Var);
                            } else {
                                c0Var2.f11052t = listAsList;
                            }
                        } while (d3Var.I("safelisted event", str4));
                    }
                    if (packageManager != null) {
                        c0Var2.f11054v = p7.a.b(context3) ? 1 : 0;
                    } else {
                        c0Var2.f11054v = 0;
                    }
                    a1Var5.a();
                    c0Var2.f11256b = true;
                    a1.f(i0Var3);
                    bVar = i0Var3.f11196w;
                    gVar.g();
                    bVar.c(79000L, "App measurement initialized, version");
                    a1.f(i0Var3);
                    bVar.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strG = c0Var.g();
                    if (TextUtils.isEmpty(a1Var3.f11001b)) {
                        if (TextUtils.isEmpty(strG)) {
                            zEquals = false;
                        } else {
                            zEquals = a1Var4.f11005r.d("debug.firebase.analytics.app").equals(strG);
                        }
                        if (zEquals) {
                            a1.f(i0Var3);
                            bVar.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            a1.f(i0Var3);
                            bVar.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG)));
                        }
                    }
                    a1.f(i0Var3);
                    i0Var3.f11197x.b("Debug-level message logging enabled");
                    if (a1Var3.P != atomicInteger.get()) {
                        a1.f(i0Var3);
                        i0Var3.f11190f.d(Integer.valueOf(a1Var3.P), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                    }
                    a1Var3.I = true;
                    zzcl zzclVar5 = n1Var.f11278g;
                    context = a1Var3.f11000a;
                    j4 = a1Var3.R;
                    x1Var = a1Var3.A;
                    a1.f(z0Var3);
                    z0Var3.c();
                    a1.d(q0Var);
                    q0Var2 = q0Var;
                    q qVar6 = q0Var2.E;
                    qVar = q0Var2.f11308f;
                    p0Var = q0Var2.e;
                    j1VarH = q0Var2.h();
                    int i14 = j1VarH.f11216b;
                    Object obj5 = gVar.f159a;
                    Boolean boolK6 = gVar.k("google_analytics_default_allow_ad_storage");
                    boolK = gVar.k("google_analytics_default_allow_analytics_storage");
                    if (boolK6 != null) {
                    }
                    if (j1Var != null) {
                        a1.e(x1Var);
                        x1Var.p(j1Var, j4);
                        j1Var2 = j1Var;
                    } else {
                        j1Var2 = j1VarH;
                    }
                    a1.e(x1Var);
                    x1Var.r(j1Var2);
                    if (p0Var.a() == 0) {
                        a1.f(i0Var3);
                        i0Var3.f11198y.c(Long.valueOf(j4), "Persisting first open");
                        p0Var.b(j4);
                    }
                    a1.e(x1Var);
                    s0Var = x1Var.f11432w;
                    if (s0Var.c()) {
                        q0 q0Var8 = s0Var.f11339b.f11006s;
                        a1.d(q0Var8);
                        q0Var8.F.h(null);
                    }
                    if (!a1Var3.c()) {
                        if (TextUtils.isEmpty(a1Var3.j().h())) {
                            c0VarJ2 = a1Var3.j();
                            c0VarJ2.d();
                            if (!TextUtils.isEmpty(c0VarJ2.f11056x)) {
                                a1.d(d3Var2);
                                strH = a1Var3.j().h();
                                q0Var2.c();
                                string2 = q0Var2.g().getString("gmp_app_id", null);
                                c0 c0VarJ19 = a1Var3.j();
                                c0VarJ19.d();
                                str3 = c0VarJ19.f11056x;
                                q0Var2.c();
                                if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                    a1.f(i0Var3);
                                    i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                    q0Var2.c();
                                    q0Var2.c();
                                    if (q0Var2.g().contains("measurement_enabled")) {
                                        boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                    } else {
                                        boolValueOf = null;
                                    }
                                    SharedPreferences.Editor editorEdit1114 = q0Var2.g().edit();
                                    editorEdit1114.clear();
                                    editorEdit1114.apply();
                                    if (boolValueOf != null) {
                                        q0Var2.c();
                                        SharedPreferences.Editor editorEdit1115 = q0Var2.g().edit();
                                        editorEdit1115.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                        editorEdit1115.apply();
                                    }
                                    a1Var3.k().h();
                                    a1Var3.F.s();
                                    a1Var3.F.r();
                                    p0Var.b(j4);
                                    qVar.h(null);
                                }
                                String strH10 = a1Var3.j().h();
                                q0Var2.c();
                                SharedPreferences.Editor editorEdit1116 = q0Var2.g().edit();
                                editorEdit1116.putString("gmp_app_id", strH10);
                                editorEdit1116.apply();
                                c0 c0VarJ110 = a1Var3.j();
                                c0VarJ110.d();
                                String str112 = c0VarJ110.f11056x;
                                q0Var2.c();
                                SharedPreferences.Editor editorEdit1117 = q0Var2.g().edit();
                                editorEdit1117.putString("admob_app_id", str112);
                                editorEdit1117.apply();
                            }
                        } else {
                            a1.d(d3Var2);
                            strH = a1Var3.j().h();
                            q0Var2.c();
                            string2 = q0Var2.g().getString("gmp_app_id", null);
                            c0 c0VarJ111 = a1Var3.j();
                            c0VarJ111.d();
                            str3 = c0VarJ111.f11056x;
                            q0Var2.c();
                            if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                a1.f(i0Var3);
                                i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                q0Var2.c();
                                q0Var2.c();
                                if (q0Var2.g().contains("measurement_enabled")) {
                                    boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                } else {
                                    boolValueOf = null;
                                }
                                SharedPreferences.Editor editorEdit1118 = q0Var2.g().edit();
                                editorEdit1118.clear();
                                editorEdit1118.apply();
                                if (boolValueOf != null) {
                                    q0Var2.c();
                                    SharedPreferences.Editor editorEdit1119 = q0Var2.g().edit();
                                    editorEdit1119.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                    editorEdit1119.apply();
                                }
                                a1Var3.k().h();
                                a1Var3.F.s();
                                a1Var3.F.r();
                                p0Var.b(j4);
                                qVar.h(null);
                            }
                            String strH11 = a1Var3.j().h();
                            q0Var2.c();
                            SharedPreferences.Editor editorEdit11110 = q0Var2.g().edit();
                            editorEdit11110.putString("gmp_app_id", strH11);
                            editorEdit11110.apply();
                            c0 c0VarJ112 = a1Var3.j();
                            c0VarJ112.d();
                            String str113 = c0VarJ112.f11056x;
                            q0Var2.c();
                            SharedPreferences.Editor editorEdit11111 = q0Var2.g().edit();
                            editorEdit11111.putString("admob_app_id", str113);
                            editorEdit11111.apply();
                        }
                        if (!q0Var2.h().f(i1.ANALYTICS_STORAGE)) {
                            qVar.h(null);
                        }
                        a1.e(x1Var);
                        x1Var.f11427r.set(qVar.g());
                        zzos.zzc();
                        if (gVar.l(null, z.f11454d0)) {
                            a1.d(d3Var2);
                            ((a1) d3Var2.f159a).f11000a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        }
                        if (TextUtils.isEmpty(a1Var3.j().h())) {
                            c0VarJ = a1Var3.j();
                            c0VarJ.d();
                            if (!TextUtils.isEmpty(c0VarJ.f11056x)) {
                                zB = a1Var3.b();
                                sharedPreferences = q0Var2.f11306c;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    q0Var2.j(!zB);
                                }
                                if (zB) {
                                    a1.e(x1Var);
                                    x1Var.z();
                                }
                                t2 t2Var9 = a1Var3.f11009v;
                                a1.e(t2Var9);
                                t2Var9.e.j();
                                a1Var3.n().t(new AtomicReference());
                                k2 k2VarN9 = a1Var3.n();
                                Bundle bundleG9 = q0Var2.H.g();
                                k2VarN9.c();
                                k2VarN9.d();
                                k2VarN9.p(new b3.b(k2VarN9, k2VarN9.m(false), bundleG9, 29));
                            }
                        } else {
                            zB = a1Var3.b();
                            sharedPreferences = q0Var2.f11306c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                q0Var2.j(!zB);
                            }
                            if (zB) {
                                a1.e(x1Var);
                                x1Var.z();
                            }
                            t2 t2Var10 = a1Var3.f11009v;
                            a1.e(t2Var10);
                            t2Var10.e.j();
                            a1Var3.n().t(new AtomicReference());
                            k2 k2VarN10 = a1Var3.n();
                            Bundle bundleG10 = q0Var2.H.g();
                            k2VarN10.c();
                            k2VarN10.d();
                            k2VarN10.p(new b3.b(k2VarN10, k2VarN10.m(false), bundleG10, 29));
                        }
                        break;
                    } else if (a1Var3.b()) {
                        a1.d(d3Var2);
                        if (!d3Var2.K("android.permission.INTERNET")) {
                            a1.f(i0Var3);
                            i0Var3.f11190f.b("App is missing INTERNET permission");
                        }
                        if (!d3Var2.K("android.permission.ACCESS_NETWORK_STATE")) {
                            a1.f(i0Var3);
                            i0Var3.f11190f.b("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        if (!p7.c.a(context).h()) {
                            if (!d3.Q(context)) {
                                a1.f(i0Var3);
                                i0Var3.f11190f.b("AppMeasurementReceiver not registered/enabled");
                            }
                            PackageManager packageManager6 = context.getPackageManager();
                            if (packageManager6 == null) {
                                if (!z10) {
                                    a1.f(i0Var3);
                                    i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                                }
                            }
                            if (!z10) {
                                a1.f(i0Var3);
                                i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                            }
                        }
                        a1.f(i0Var3);
                        i0Var3.f11190f.b("Uploading is not possible. App measurement disabled");
                    }
                    q0Var2.f11315x.a(true);
                    return;
                }
                i0 i0Var9 = a1Var.f11007t;
                a1.f(i0Var9);
                i0Var9.f11190f.b("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = a1Var.f11000a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    } else {
                        listAsList = null;
                    }
                    break;
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    c0Var2.f11052t = listAsList;
                } else if (listAsList.isEmpty()) {
                    a1.f(i0Var5);
                    i0Var5.f11195v.b("Safelisted event list is empty. Ignoring");
                } else {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            str4 = (String) it.next();
                            d3Var = a1Var5.f11010w;
                            a1.d(d3Var);
                        } else {
                            c0Var2.f11052t = listAsList;
                        }
                    } while (d3Var.I("safelisted event", str4));
                }
                if (packageManager != null) {
                    c0Var2.f11054v = p7.a.b(context3) ? 1 : 0;
                } else {
                    c0Var2.f11054v = 0;
                }
                a1Var5.a();
                c0Var2.f11256b = true;
                a1.f(i0Var3);
                bVar = i0Var3.f11196w;
                gVar.g();
                bVar.c(79000L, "App measurement initialized, version");
                a1.f(i0Var3);
                bVar.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strG = c0Var.g();
                if (TextUtils.isEmpty(a1Var3.f11001b)) {
                    if (TextUtils.isEmpty(strG)) {
                        zEquals = false;
                    } else {
                        zEquals = a1Var4.f11005r.d("debug.firebase.analytics.app").equals(strG);
                    }
                    if (zEquals) {
                        a1.f(i0Var3);
                        bVar.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        a1.f(i0Var3);
                        bVar.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG)));
                    }
                }
                a1.f(i0Var3);
                i0Var3.f11197x.b("Debug-level message logging enabled");
                if (a1Var3.P != atomicInteger.get()) {
                    a1.f(i0Var3);
                    i0Var3.f11190f.d(Integer.valueOf(a1Var3.P), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                }
                a1Var3.I = true;
                zzcl zzclVar6 = n1Var.f11278g;
                context = a1Var3.f11000a;
                j4 = a1Var3.R;
                x1Var = a1Var3.A;
                a1.f(z0Var3);
                z0Var3.c();
                a1.d(q0Var);
                q0Var2 = q0Var;
                q qVar7 = q0Var2.E;
                qVar = q0Var2.f11308f;
                p0Var = q0Var2.e;
                j1VarH = q0Var2.h();
                int i15 = j1VarH.f11216b;
                Object obj6 = gVar.f159a;
                Boolean boolK7 = gVar.k("google_analytics_default_allow_ad_storage");
                boolK = gVar.k("google_analytics_default_allow_analytics_storage");
                if (boolK7 != null) {
                }
                if (j1Var != null) {
                    a1.e(x1Var);
                    x1Var.p(j1Var, j4);
                    j1Var2 = j1Var;
                } else {
                    j1Var2 = j1VarH;
                }
                a1.e(x1Var);
                x1Var.r(j1Var2);
                if (p0Var.a() == 0) {
                    a1.f(i0Var3);
                    i0Var3.f11198y.c(Long.valueOf(j4), "Persisting first open");
                    p0Var.b(j4);
                }
                a1.e(x1Var);
                s0Var = x1Var.f11432w;
                if (s0Var.c()) {
                    q0 q0Var9 = s0Var.f11339b.f11006s;
                    a1.d(q0Var9);
                    q0Var9.F.h(null);
                }
                if (!a1Var3.c()) {
                    if (TextUtils.isEmpty(a1Var3.j().h())) {
                        c0VarJ2 = a1Var3.j();
                        c0VarJ2.d();
                        if (!TextUtils.isEmpty(c0VarJ2.f11056x)) {
                            a1.d(d3Var2);
                            strH = a1Var3.j().h();
                            q0Var2.c();
                            string2 = q0Var2.g().getString("gmp_app_id", null);
                            c0 c0VarJ113 = a1Var3.j();
                            c0VarJ113.d();
                            str3 = c0VarJ113.f11056x;
                            q0Var2.c();
                            if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                                a1.f(i0Var3);
                                i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                                q0Var2.c();
                                q0Var2.c();
                                if (q0Var2.g().contains("measurement_enabled")) {
                                    boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                                } else {
                                    boolValueOf = null;
                                }
                                SharedPreferences.Editor editorEdit11112 = q0Var2.g().edit();
                                editorEdit11112.clear();
                                editorEdit11112.apply();
                                if (boolValueOf != null) {
                                    q0Var2.c();
                                    SharedPreferences.Editor editorEdit11113 = q0Var2.g().edit();
                                    editorEdit11113.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                    editorEdit11113.apply();
                                }
                                a1Var3.k().h();
                                a1Var3.F.s();
                                a1Var3.F.r();
                                p0Var.b(j4);
                                qVar.h(null);
                            }
                            String strH12 = a1Var3.j().h();
                            q0Var2.c();
                            SharedPreferences.Editor editorEdit11114 = q0Var2.g().edit();
                            editorEdit11114.putString("gmp_app_id", strH12);
                            editorEdit11114.apply();
                            c0 c0VarJ114 = a1Var3.j();
                            c0VarJ114.d();
                            String str114 = c0VarJ114.f11056x;
                            q0Var2.c();
                            SharedPreferences.Editor editorEdit11115 = q0Var2.g().edit();
                            editorEdit11115.putString("admob_app_id", str114);
                            editorEdit11115.apply();
                        }
                    } else {
                        a1.d(d3Var2);
                        strH = a1Var3.j().h();
                        q0Var2.c();
                        string2 = q0Var2.g().getString("gmp_app_id", null);
                        c0 c0VarJ115 = a1Var3.j();
                        c0VarJ115.d();
                        str3 = c0VarJ115.f11056x;
                        q0Var2.c();
                        if (d3.R(strH, string2, str3, q0Var2.g().getString("admob_app_id", null))) {
                            a1.f(i0Var3);
                            i0Var3.f11196w.b("Rechecking which service to use due to a GMP App Id change");
                            q0Var2.c();
                            q0Var2.c();
                            if (q0Var2.g().contains("measurement_enabled")) {
                                boolValueOf = Boolean.valueOf(q0Var2.g().getBoolean("measurement_enabled", true));
                            } else {
                                boolValueOf = null;
                            }
                            SharedPreferences.Editor editorEdit11116 = q0Var2.g().edit();
                            editorEdit11116.clear();
                            editorEdit11116.apply();
                            if (boolValueOf != null) {
                                q0Var2.c();
                                SharedPreferences.Editor editorEdit11117 = q0Var2.g().edit();
                                editorEdit11117.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                editorEdit11117.apply();
                            }
                            a1Var3.k().h();
                            a1Var3.F.s();
                            a1Var3.F.r();
                            p0Var.b(j4);
                            qVar.h(null);
                        }
                        String strH13 = a1Var3.j().h();
                        q0Var2.c();
                        SharedPreferences.Editor editorEdit11118 = q0Var2.g().edit();
                        editorEdit11118.putString("gmp_app_id", strH13);
                        editorEdit11118.apply();
                        c0 c0VarJ116 = a1Var3.j();
                        c0VarJ116.d();
                        String str115 = c0VarJ116.f11056x;
                        q0Var2.c();
                        SharedPreferences.Editor editorEdit11119 = q0Var2.g().edit();
                        editorEdit11119.putString("admob_app_id", str115);
                        editorEdit11119.apply();
                    }
                    if (!q0Var2.h().f(i1.ANALYTICS_STORAGE)) {
                        qVar.h(null);
                    }
                    a1.e(x1Var);
                    x1Var.f11427r.set(qVar.g());
                    zzos.zzc();
                    if (gVar.l(null, z.f11454d0)) {
                        a1.d(d3Var2);
                        ((a1) d3Var2.f159a).f11000a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    }
                    if (TextUtils.isEmpty(a1Var3.j().h())) {
                        c0VarJ = a1Var3.j();
                        c0VarJ.d();
                        if (!TextUtils.isEmpty(c0VarJ.f11056x)) {
                            zB = a1Var3.b();
                            sharedPreferences = q0Var2.f11306c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                q0Var2.j(!zB);
                            }
                            if (zB) {
                                a1.e(x1Var);
                                x1Var.z();
                            }
                            t2 t2Var11 = a1Var3.f11009v;
                            a1.e(t2Var11);
                            t2Var11.e.j();
                            a1Var3.n().t(new AtomicReference());
                            k2 k2VarN11 = a1Var3.n();
                            Bundle bundleG11 = q0Var2.H.g();
                            k2VarN11.c();
                            k2VarN11.d();
                            k2VarN11.p(new b3.b(k2VarN11, k2VarN11.m(false), bundleG11, 29));
                        }
                    } else {
                        zB = a1Var3.b();
                        sharedPreferences = q0Var2.f11306c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            q0Var2.j(!zB);
                        }
                        if (zB) {
                            a1.e(x1Var);
                            x1Var.z();
                        }
                        t2 t2Var12 = a1Var3.f11009v;
                        a1.e(t2Var12);
                        t2Var12.e.j();
                        a1Var3.n().t(new AtomicReference());
                        k2 k2VarN12 = a1Var3.n();
                        Bundle bundleG12 = q0Var2.H.g();
                        k2VarN12.c();
                        k2VarN12.d();
                        k2VarN12.p(new b3.b(k2VarN12, k2VarN12.m(false), bundleG12, 29));
                    }
                    break;
                } else if (a1Var3.b()) {
                    a1.d(d3Var2);
                    if (!d3Var2.K("android.permission.INTERNET")) {
                        a1.f(i0Var3);
                        i0Var3.f11190f.b("App is missing INTERNET permission");
                    }
                    if (!d3Var2.K("android.permission.ACCESS_NETWORK_STATE")) {
                        a1.f(i0Var3);
                        i0Var3.f11190f.b("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    if (!p7.c.a(context).h()) {
                        if (!d3.Q(context)) {
                            a1.f(i0Var3);
                            i0Var3.f11190f.b("AppMeasurementReceiver not registered/enabled");
                        }
                        PackageManager packageManager7 = context.getPackageManager();
                        if (packageManager7 == null) {
                            if (!z10) {
                                a1.f(i0Var3);
                                i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                            }
                        }
                        if (!z10) {
                            a1.f(i0Var3);
                            i0Var3.f11190f.b("AppMeasurementService not registered/enabled");
                        }
                    }
                    a1.f(i0Var3);
                    i0Var3.f11190f.b("Uploading is not possible. App measurement disabled");
                }
                q0Var2.f11315x.a(true);
                return;
            case 5:
                z2 z2Var = ((e1) this.f10660c).f11104a;
                z2Var.a();
                z7.c cVar = (z7.c) this.f10659b;
                if (cVar.f11039c.zza() == null) {
                    z2Var.getClass();
                    String str20 = cVar.f11037a;
                    com.google.android.gms.common.internal.i0.i(str20);
                    f3 f3VarU = z2Var.u(str20);
                    if (f3VarU != null) {
                        z2Var.j(cVar, f3VarU);
                        return;
                    }
                    return;
                }
                z2Var.getClass();
                String str21 = cVar.f11037a;
                com.google.android.gms.common.internal.i0.i(str21);
                f3 f3VarU2 = z2Var.u(str21);
                if (f3VarU2 != null) {
                    z2Var.m(cVar, f3VarU2);
                    return;
                }
                return;
            case 6:
                x1 x1Var2 = (x1) this.f10659b;
                String str22 = (String) this.f10660c;
                c0 c0VarJ20 = ((a1) x1Var2.f159a).j();
                String str23 = c0VarJ20.A;
                boolean z15 = false;
                if (str23 != null && !str23.equals(str22)) {
                    z15 = true;
                }
                c0VarJ20.A = str22;
                if (z15) {
                    ((a1) x1Var2.f159a).j().j();
                    return;
                }
                return;
            case 7:
                zzcf zzcfVar = (zzcf) this.f10659b;
                x1 x1Var3 = (x1) this.f10660c;
                a1 a1Var6 = (a1) x1Var3.f159a;
                a1 a1Var7 = (a1) x1Var3.f159a;
                t2 t2Var13 = a1Var6.f11009v;
                a1.e(t2Var13);
                zzqr.zzc();
                a1 a1Var8 = (a1) t2Var13.f159a;
                z7.g gVar5 = a1Var8.f11005r;
                i0 i0Var10 = a1Var8.f11007t;
                q0 q0Var10 = a1Var8.f11006s;
                if (gVar5.l(null, z.f11472o0)) {
                    a1.d(q0Var10);
                    if (q0Var10.h().f(i1.ANALYTICS_STORAGE)) {
                        a1.d(q0Var10);
                        a1Var8.f11012y.getClass();
                        if (!q0Var10.k(System.currentTimeMillis())) {
                            a1.d(q0Var10);
                            if (q0Var10.f11317z.a() != 0) {
                                a1.d(q0Var10);
                                lValueOf = Long.valueOf(q0Var10.f11317z.a());
                            }
                        }
                        if (lValueOf == null) {
                            d3 d3Var3 = a1Var7.f11010w;
                            a1.d(d3Var3);
                            d3Var3.A(zzcfVar, lValueOf.longValue());
                            return;
                        } else {
                            try {
                                zzcfVar.zze(null);
                                return;
                            } catch (RemoteException e12) {
                                i0 i0Var11 = a1Var7.f11007t;
                                a1.f(i0Var11);
                                i0Var11.f11190f.c(e12, "getSessionId failed with exception");
                                return;
                            }
                        }
                    }
                    a1.f(i0Var10);
                    i0Var10.f11195v.b("Analytics storage consent denied; will not get session id");
                } else {
                    a1.f(i0Var10);
                    i0Var10.f11195v.b("getSessionId has been disabled.");
                }
                lValueOf = null;
                if (lValueOf == null) {
                    zzcfVar.zze(null);
                    return;
                }
                d3 d3Var4 = a1Var7.f11010w;
                a1.d(d3Var4);
                d3Var4.A(zzcfVar, lValueOf.longValue());
                return;
            case 8:
                ((x1) this.f10660c).u((Boolean) this.f10659b, true);
                return;
            case 9:
                k2 k2Var2 = (k2) this.f10660c;
                b0 b0Var = k2Var2.f11238d;
                a1 a1Var9 = (a1) k2Var2.f159a;
                if (b0Var == null) {
                    i0 i0Var12 = a1Var9.f11007t;
                    a1.f(i0Var12);
                    i0Var12.f11190f.b("Failed to send current screen to service");
                    return;
                }
                try {
                    b2 b2Var = (b2) this.f10659b;
                    if (b2Var == null) {
                        b0Var.q(0L, null, null, a1Var9.f11000a.getPackageName());
                    } else {
                        b0Var.q(b2Var.f11030c, b2Var.f11028a, b2Var.f11029b, a1Var9.f11000a.getPackageName());
                    }
                    k2Var2.o();
                    return;
                } catch (RemoteException e13) {
                    i0 i0Var13 = ((a1) k2Var2.f159a).f11007t;
                    a1.f(i0Var13);
                    i0Var13.f11190f.c(e13, "Failed to send current screen to the service");
                    return;
                }
            case 10:
                k2.q(((j2) this.f10660c).f11219c, (ComponentName) this.f10659b);
                return;
            case 11:
                z2 z2Var2 = (z2) this.f10660c;
                z2Var2.a();
                Runnable runnable = (Runnable) this.f10659b;
                z2Var2.zzaB().c();
                if (z2Var2.A == null) {
                    z2Var2.A = new ArrayList();
                }
                z2Var2.A.add(runnable);
                z2Var2.p();
                return;
            default:
                x1 x1Var4 = ((AppMeasurementDynamiteService) this.f10660c).f2316a.A;
                a1.e(x1Var4);
                s5.j jVar = (s5.j) this.f10659b;
                x1Var4.c();
                x1Var4.d();
                l1 l1Var = x1Var4.f11425d;
                if (jVar != l1Var) {
                    com.google.android.gms.common.internal.i0.k("EventInterceptor already set.", l1Var == null);
                }
                x1Var4.f11425d = jVar;
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f10658a) {
            case 0:
                Runnable runnable = (Runnable) this.f10659b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((k) this.f10660c).f10664c;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public j(r0 r0Var, zzbr zzbrVar, r0 r0Var2) {
        this.f10658a = 3;
        this.f10660c = r0Var;
        this.f10659b = zzbrVar;
    }

    public /* synthetic */ j(x1 x1Var, String str) {
        this.f10658a = 6;
        this.f10659b = x1Var;
        this.f10660c = str;
    }

    public j(k kVar) {
        this.f10658a = 0;
        this.f10660c = kVar;
    }
}
