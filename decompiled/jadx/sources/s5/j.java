package s5;

import a4.w;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.y;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.internal.p002firebaseauthapi.zzab;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzaha;
import com.google.android.gms.internal.p002firebaseauthapi.zzahb;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.gms.internal.p002firebaseauthapi.zzbf;
import com.google.android.gms.internal.p002firebaseauthapi.zzbk;
import com.google.android.gms.internal.p002firebaseauthapi.zzca;
import com.google.android.gms.internal.p002firebaseauthapi.zzj;
import com.google.android.gms.internal.p002firebaseauthapi.zzla;
import com.google.android.gms.internal.p002firebaseauthapi.zzlf;
import com.google.android.gms.internal.p002firebaseauthapi.zzmh;
import com.google.android.gms.internal.p002firebaseauthapi.zzmj;
import com.google.android.gms.internal.p002firebaseauthapi.zzos;
import com.google.android.gms.internal.p002firebaseauthapi.zzq;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import da.v;
import h6.m;
import h6.o0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import q0.b2;
import q0.d2;
import q0.s;
import q0.t;
import t2.o;
import t2.q;
import t2.r;
import u8.n;
import v9.a0;
import v9.x;
import w9.b0;
import w9.d0;
import w9.e0;
import x1.d1;
import x1.g1;
import x1.h1;
import x1.i1;
import x1.w0;
import y1.u;
import z7.a1;
import z7.l1;
import z7.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class j implements n5.b, r, t, com.bumptech.glide.load.data.d, OnCompleteListener, Continuation, g2.b, zzo, l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f8443d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8446c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.f8444a = i;
        this.f8445b = obj;
        this.f8446c = obj2;
    }

    public static j E(Context context, String str) {
        j jVar = f8443d;
        if (jVar == null || !zzq.zza((String) jVar.f8445b, str)) {
            f8443d = new j(context, str, 10);
        }
        return f8443d;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static j a(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new j(28, channel, fileLockLock);
                } catch (IOException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e4) {
                    e = e4;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e10) {
                    e = e10;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e11) {
                e = e11;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e12) {
            e = e12;
            channel = null;
            fileLockLock = null;
        }
    }

    public static int m(int i, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        return i11 + 1 > i10 ? i12 + 1 : i12;
    }

    public Object A() {
        x3.c cVar = (x3.c) this.f8445b;
        x3.c cVar2 = cVar.f10266d;
        while (true) {
            boolean zEquals = cVar2.equals(cVar);
            Object obj = cVar2.f10263a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = cVar2.f10264b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? cVar2.f10264b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            x3.c cVar3 = cVar2.f10266d;
            cVar3.f10265c = cVar2.f10265c;
            cVar2.f10265c.f10266d = cVar3;
            ((HashMap) this.f8446c).remove(obj);
            ((x3.h) obj).a();
            cVar2 = cVar2.f10266d;
        }
    }

    public void B(w0 w0Var) {
        r.h hVar = (r.h) this.f8446c;
        for (int iG = hVar.g() - 1; iG >= 0; iG--) {
            if (w0Var == hVar.h(iG)) {
                Object[] objArr = hVar.f8094c;
                Object obj = objArr[iG];
                Object obj2 = r.i.f8096a;
                if (obj == obj2) {
                    break;
                }
                objArr[iG] = obj2;
                hVar.f8092a = true;
                break;
            }
        }
        i1 i1Var = (i1) ((r.k) this.f8445b).remove(w0Var);
        if (i1Var != null) {
            i1Var.f10110a = 0;
            i1Var.f10111b = null;
            i1Var.f10112c = null;
            i1.f10109d.b(i1Var);
        }
    }

    public void C(android.support.v4.media.session.a aVar) {
        e3.k kVar = (e3.k) this.f8446c;
        ((y) this.f8445b).h(aVar);
        if (aVar instanceof q) {
            kVar.h((q) aVar);
        } else if (aVar instanceof o) {
            kVar.i(((o) aVar).f8555a);
        }
    }

    public void D() {
        synchronized (this) {
            ((AtomicInteger) this.f8445b).decrementAndGet();
            if (((AtomicInteger) this.f8445b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public String F(String str) {
        String str2;
        zzmj zzmjVar = (zzmj) this.f8446c;
        if (zzmjVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmjVar) {
                str2 = new String(((zzbk) ((zzmj) this.f8446c).zza().zze(zzos.zza(), zzbk.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }

    public String G() {
        if (((zzmj) this.f8446c) == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzca zzcaVarZza = zzbf.zza(byteArrayOutputStream);
        try {
            synchronized (((zzmj) this.f8446c)) {
                ((zzmj) this.f8446c).zza().zzb().zzg(zzcaVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0 H(JSONObject jSONObject) {
        d0 d0Var;
        JSONArray jSONArray;
        h7.a a0Var;
        h7.a aVar;
        e0 e0Var;
        d0 d0Var2 = null;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z4 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (i < length) {
                d0Var = d0Var2;
                try {
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i));
                        try {
                            arrayList.add(new b0(jSONObject2.optString("userId"), jSONObject2.optString("providerId"), jSONObject2.optString("email"), jSONObject2.optString("phoneNumber"), jSONObject2.optString("displayName"), jSONObject2.optString("photoUrl"), jSONObject2.optBoolean("isEmailVerified"), jSONObject2.optString("rawUserInfo")));
                            i++;
                            d0Var2 = d0Var;
                        } catch (JSONException e) {
                            e = e;
                        }
                    } catch (JSONException e4) {
                        Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
                        throw new zzzr(e4);
                    }
                } catch (zzzr e10) {
                    e = e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    e = e11;
                } catch (IllegalArgumentException e12) {
                    e = e12;
                }
            }
            h7.a aVar2 = d0Var2;
            d0 d0Var3 = new d0(n9.g.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzahb zzahbVarZzd = zzahb.zzd(string);
                i0.i(zzahbVarZzd);
                d0Var3.f9819a = zzahbVarZzd;
            }
            if (!z4) {
                d0Var3.f9825s = Boolean.FALSE;
            }
            d0Var3.f9824r = str;
            if (jSONObject.has("userMetadata")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("userMetadata");
                if (jSONObject3 == null) {
                    e0Var = aVar2;
                } else {
                    try {
                        e0Var = new e0(jSONObject3.getLong("lastSignInTimestamp"), jSONObject3.getLong("creationTimestamp"));
                    } catch (JSONException unused) {
                        e0Var = aVar2;
                    }
                }
                if (e0Var != 0) {
                    d0Var3.f9826t = e0Var;
                }
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject4 = new JSONObject(jSONArray.getString(i10));
                    String strOptString = jSONObject4.optString("factorIdKey");
                    if (!"phone".equals(strOptString)) {
                        if (strOptString != "totp" && (strOptString == null || !strOptString.equals("totp"))) {
                            aVar = aVar2;
                        } else {
                            if (!jSONObject4.has("enrollmentTimestamp")) {
                                throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
                            }
                            long jOptLong = jSONObject4.optLong("enrollmentTimestamp");
                            if (jSONObject4.opt("totpInfo") == null) {
                                throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
                            }
                            a0Var = new a0(jSONObject4.optString("uid"), jSONObject4.optString("displayName"), jOptLong, new zzaia());
                        }
                        arrayList2.add(aVar);
                    } else {
                        if (!jSONObject4.has("enrollmentTimestamp")) {
                            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
                        }
                        a0Var = new x(jSONObject4.optLong("enrollmentTimestamp"), jSONObject4.optString("uid"), jSONObject4.optString("displayName"), jSONObject4.optString("phoneNumber"));
                    }
                    aVar = a0Var;
                    arrayList2.add(aVar);
                }
                d0Var3.m(arrayList2);
            }
            return d0Var3;
        } catch (zzzr e13) {
            e = e13;
            d0Var = d0Var2;
        } catch (ArrayIndexOutOfBoundsException e14) {
            e = e14;
            d0Var = d0Var2;
        } catch (IllegalArgumentException e15) {
            e = e15;
            d0Var = d0Var2;
        } catch (JSONException e16) {
            e = e16;
            d0Var = d0Var2;
        }
        Log.wtf(((j7.a) this.f8446c).f5701a, e);
        return d0Var;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b(Exception exc) {
        w3.a0 a0Var = (w3.a0) this.f8446c;
        w wVar = (w) this.f8445b;
        w wVar2 = a0Var.f9485f;
        if (wVar2 == null || wVar2 != wVar) {
            return;
        }
        w3.a0 a0Var2 = (w3.a0) this.f8446c;
        w wVar3 = (w) this.f8445b;
        w3.h hVar = a0Var2.f9482b;
        w3.d dVar = a0Var2.f9486r;
        com.bumptech.glide.load.data.e eVar = wVar3.f182c;
        hVar.a(dVar, exc, eVar, eVar.d());
    }

    public void c(w0 w0Var, s sVar) {
        r.k kVar = (r.k) this.f8445b;
        i1 i1VarA = (i1) kVar.get(w0Var);
        if (i1VarA == null) {
            i1VarA = i1.a();
            kVar.put(w0Var, i1VarA);
        }
        i1VarA.f10112c = sVar;
        i1VarA.f10110a |= 8;
    }

    public boolean d() {
        synchronized (this) {
            if (((AtomicBoolean) this.f8446c).get()) {
                return false;
            }
            ((AtomicInteger) this.f8445b).incrementAndGet();
            return true;
        }
    }

    public void e() {
        int[] iArr = (int[]) this.f8445b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f8446c = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(Object obj) {
        w3.a0 a0Var = (w3.a0) this.f8446c;
        w wVar = (w) this.f8445b;
        w wVar2 = a0Var.f9485f;
        if (wVar2 == null || wVar2 != wVar) {
            return;
        }
        w3.a0 a0Var2 = (w3.a0) this.f8446c;
        w wVar3 = (w) this.f8445b;
        w3.j jVar = a0Var2.f9481a.f9509p;
        if (obj != null && jVar.a(wVar3.f182c.d())) {
            a0Var2.e = obj;
            a0Var2.f9482b.l(2);
        } else {
            w3.h hVar = a0Var2.f9482b;
            u3.f fVar = wVar3.f180a;
            com.bumptech.glide.load.data.e eVar = wVar3.f182c;
            hVar.b(fVar, obj, eVar, eVar.d(), a0Var2.f9486r);
        }
    }

    public void g(int i) {
        int[] iArr = (int[]) this.f8445b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f8445b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f8445b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f8445b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // tb.a
    public Object get() {
        r7.j jVar = new r7.j();
        r7.i iVar = new r7.i();
        Object obj = ((tb.a) this.f8445b).get();
        tb.a aVar = (tb.a) this.f8446c;
        return new i(jVar, iVar, a.f8425f, (l) obj, aVar);
    }

    @Override // g2.b
    public g2.a h(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        jc.i.e(str, "fileName");
        m mVar = (m) this.f8446c;
        if (!str.equals(":memory:")) {
            str = ((y1.a) mVar.f5031c).f10394a.getDatabasePath(str).getAbsolutePath();
            jc.i.b(str);
        }
        boolean z4 = true;
        z1.a aVar = new z1.a(str, (mVar.f5029a || mVar.f5030b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = aVar.f10954a;
        reentrantLock.lock();
        j jVar = aVar.f10955b;
        if (jVar != null) {
            try {
                jVar.q();
            } catch (Throwable th) {
                th = th;
                z4 = false;
            }
        }
        try {
            try {
                if (mVar.f5030b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                g2.a aVarH = ((g2.b) this.f8445b).h(str);
                if (mVar.f5029a) {
                    if (((y1.a) mVar.f5031c).f10399g == u.f10513c) {
                        jd.d.o(aVarH, "PRAGMA synchronous = NORMAL");
                    } else {
                        jd.d.o(aVarH, "PRAGMA synchronous = FULL");
                    }
                    m.b(aVarH);
                    ((androidx.emoji2.text.g) mVar.f5032d).s(aVarH);
                } else {
                    try {
                        mVar.f5030b = true;
                        m.a(mVar, aVarH);
                        mVar.f5030b = false;
                    } catch (Throwable th2) {
                        mVar.f5030b = false;
                        throw th2;
                    }
                }
                if (jVar != null && (fileChannel2 = (FileChannel) jVar.f8446c) != null) {
                    try {
                        fileChannel2.close();
                        jVar.f8446c = null;
                    } catch (Throwable th3) {
                        jVar.f8446c = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return aVarH;
            } catch (Throwable th4) {
                if (jVar != null && (fileChannel = (FileChannel) jVar.f8446c) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        jVar.f8446c = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        try {
            if (z4) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    public View i(int i, int i10, int i11, int i12) {
        g1 g1Var = (g1) this.f8446c;
        h1 h1Var = (h1) this.f8445b;
        int iB = h1Var.b();
        int iC = h1Var.c();
        int i13 = i10 > i ? 1 : -1;
        View view = null;
        while (i != i10) {
            View viewD = h1Var.d(i);
            int iA = h1Var.a(viewD);
            int iG = h1Var.g(viewD);
            g1Var.f10075b = iB;
            g1Var.f10076c = iC;
            g1Var.f10077d = iA;
            g1Var.e = iG;
            if (i11 != 0) {
                g1Var.f10074a = i11;
                if (g1Var.a()) {
                    return viewD;
                }
            }
            if (i12 != 0) {
                g1Var.f10074a = i12;
                if (g1Var.a()) {
                    view = viewD;
                }
            }
            i += i13;
        }
        return view;
    }

    public Object j(x3.h hVar) {
        HashMap map = (HashMap) this.f8446c;
        x3.c cVar = (x3.c) map.get(hVar);
        if (cVar == null) {
            cVar = new x3.c(hVar);
            map.put(hVar, cVar);
        } else {
            hVar.a();
        }
        x3.c cVar2 = cVar.f10266d;
        cVar2.f10265c = cVar.f10265c;
        cVar.f10265c.f10266d = cVar2;
        x3.c cVar3 = (x3.c) this.f8445b;
        cVar.f10266d = cVar3;
        x3.c cVar4 = cVar3.f10265c;
        cVar.f10265c = cVar4;
        cVar4.f10266d = cVar;
        cVar.f10266d.f10265c = cVar;
        ArrayList arrayList = cVar.f10264b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return cVar.f10264b.remove(size - 1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    @Override // q0.t
    public d2 k(View view, d2 d2Var) {
        boolean z4;
        ea.e eVar = (ea.e) this.f8445b;
        r7.d dVar = (r7.d) this.f8446c;
        int i = dVar.f8196a;
        int i10 = dVar.f8197b;
        int i11 = dVar.f8198c;
        b2 b2Var = d2Var.f7892a;
        h0.c cVarF = b2Var.f(7);
        h0.c cVarF2 = b2Var.f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f3516c;
        int i12 = cVarF.f4546b;
        int i13 = cVarF.f4547c;
        int i14 = cVarF.f4545a;
        bottomSheetBehavior.f2363w = i12;
        boolean zF = n.f(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z10 = bottomSheetBehavior.f2355o;
        if (z10) {
            int iA = d2Var.a();
            bottomSheetBehavior.f2362v = iA;
            paddingBottom = iA + i11;
        }
        if (bottomSheetBehavior.f2356p) {
            paddingLeft = (zF ? i10 : i) + i14;
        }
        if (bottomSheetBehavior.f2357q) {
            if (!zF) {
                i = i10;
            }
            paddingRight = i + i13;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z11 = true;
        if (!bottomSheetBehavior.f2359s || marginLayoutParams.leftMargin == i14) {
            z4 = false;
        } else {
            marginLayoutParams.leftMargin = i14;
            z4 = true;
        }
        if (bottomSheetBehavior.f2360t && marginLayoutParams.rightMargin != i13) {
            marginLayoutParams.rightMargin = i13;
            z4 = true;
        }
        if (bottomSheetBehavior.f2361u) {
            int i15 = marginLayoutParams.topMargin;
            int i16 = cVarF.f4546b;
            if (i15 != i16) {
                marginLayoutParams.topMargin = i16;
            } else {
                z11 = z4;
            }
        } else {
            z11 = z4;
        }
        if (z11) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z12 = eVar.f3515b;
        if (z12) {
            bottomSheetBehavior.f2353m = cVarF2.f4548d;
        }
        if (!z10 && !z12) {
            return d2Var;
        }
        bottomSheetBehavior.I();
        return d2Var;
    }

    public String l(u3.f fVar) {
        String str;
        synchronized (((p4.j) this.f8445b)) {
            str = (String) ((p4.j) this.f8445b).a(fVar);
        }
        if (str == null) {
            y3.e eVar = (y3.e) ((a2.l) this.f8446c).c();
            try {
                fVar.a(eVar.f10552a);
                byte[] bArrDigest = eVar.f10552a.digest();
                char[] cArr = p4.n.f7812b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b10 = bArrDigest[i];
                        int i10 = i * 2;
                        char[] cArr2 = p4.n.f7811a;
                        cArr[i10] = cArr2[(b10 & 255) >>> 4];
                        cArr[i10 + 1] = cArr2[b10 & 15];
                    }
                    str = new String(cArr);
                }
                ((a2.l) this.f8446c).b(eVar);
            } catch (Throwable th) {
                ((a2.l) this.f8446c).b(eVar);
                throw th;
            }
        }
        synchronized (((p4.j) this.f8445b)) {
            ((p4.j) this.f8445b).d(fVar, str);
        }
        return str;
    }

    public void n(Bundle bundle, String str, String str2, long j4) {
        try {
            ((zzci) this.f8445b).zze(str, str2, bundle, j4);
        } catch (RemoteException e) {
            a1 a1Var = ((AppMeasurementDynamiteService) this.f8446c).f2316a;
            if (a1Var != null) {
                z7.i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11193t.c(e, "Event interceptor threw exception");
            }
        }
    }

    public void o() {
        ((SparseIntArray) this.f8445b).clear();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f8444a) {
            case 6:
                Intent intent = new Intent("android.intent.action.VIEW");
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f8445b;
                ResolveInfo resolveInfoResolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
                String str = (String) this.f8446c;
                if (resolveInfoResolveActivity == null) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    genericIdpActivity.zze(str, null);
                } else {
                    List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent2.putExtra("com.android.browser.application_id", str);
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                        intent2.addFlags(1073741824);
                        intent2.addFlags(268435456);
                        genericIdpActivity.startActivity(intent2);
                    } else {
                        o0 o0VarB = new fd.e().b();
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                        o0VarB.l(genericIdpActivity, (Uri) task.getResult());
                    }
                }
                break;
            default:
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f8445b;
                String str2 = (String) this.f8446c;
                recaptchaActivity.getClass();
                if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
                    Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    recaptchaActivity.zze(str2, null);
                } else {
                    List<ResolveInfo> listQueryIntentServices2 = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (listQueryIntentServices2 == null || listQueryIntentServices2.isEmpty()) {
                        Intent intent3 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent3.putExtra("com.android.browser.application_id", str2);
                        intent3.addFlags(1073741824);
                        intent3.addFlags(268435456);
                        recaptchaActivity.startActivity(intent3);
                    } else {
                        o0 o0VarB2 = new fd.e().b();
                        Intent intent4 = (Intent) o0VarB2.f5061b;
                        intent4.addFlags(1073741824);
                        intent4.addFlags(268435456);
                        o0VarB2.l(recaptchaActivity, (Uri) task.getResult());
                    }
                }
                break;
        }
    }

    public boolean p(View view) {
        g1 g1Var = (g1) this.f8446c;
        h1 h1Var = (h1) this.f8445b;
        int iB = h1Var.b();
        int iC = h1Var.c();
        int iA = h1Var.a(view);
        int iG = h1Var.g(view);
        g1Var.f10075b = iB;
        g1Var.f10076c = iC;
        g1Var.f10077d = iA;
        g1Var.e = iG;
        g1Var.f10074a = 24579;
        return g1Var.a();
    }

    public void q() throws IOException {
        String str = (String) this.f8445b;
        if (((FileChannel) this.f8446c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f8446c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f8446c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f8446c = null;
            throw new IllegalStateException(v.i("Unable to lock file: '", str, "'."), th);
        }
    }

    public void r(int i, int i10) {
        int[] iArr = (int[]) this.f8445b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i11 = i + i10;
        g(i11);
        int[] iArr2 = (int[]) this.f8445b;
        System.arraycopy(iArr2, i, iArr2, i11, (iArr2.length - i) - i10);
        Arrays.fill((int[]) this.f8445b, i, i11, -1);
        ArrayList arrayList = (ArrayList) this.f8446c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d1 d1Var = (d1) ((ArrayList) this.f8446c).get(size);
            int i12 = d1Var.f10033a;
            if (i12 >= i) {
                d1Var.f10033a = i12 + i10;
            }
        }
    }

    public void s(int i, int i10) {
        int[] iArr = (int[]) this.f8445b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i11 = i + i10;
        g(i11);
        int[] iArr2 = (int[]) this.f8445b;
        System.arraycopy(iArr2, i11, iArr2, i, (iArr2.length - i) - i10);
        int[] iArr3 = (int[]) this.f8445b;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f8446c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d1 d1Var = (d1) ((ArrayList) this.f8446c).get(size);
            int i12 = d1Var.f10033a;
            if (i12 >= i) {
                if (i12 < i11) {
                    ((ArrayList) this.f8446c).remove(size);
                } else {
                    d1Var.f10033a = i12 - i10;
                }
            }
        }
    }

    public void t(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ba.b bVar = "clx".equals(bundle2.getString("_o")) ? (a2.l) this.f8445b : (ib.c) this.f8446c;
            if (bVar == null) {
                return;
            }
            bVar.l(string, bundle2);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        a3.j jVar = (a3.j) this.f8446c;
        String str = (String) this.f8445b;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            i0.i(exception);
            String message = exception.getMessage();
            i0.i(message);
            return Tasks.forException(new w9.o(message));
        }
        zzaha zzahaVar = (zzaha) task.getResult();
        String strZzb = zzahaVar.zzb();
        if (zzac.zzd(strZzb)) {
            return Tasks.forException(new w9.o("No Recaptcha Enterprise siteKey configured for tenant/project ".concat(String.valueOf(str))));
        }
        List listZzd = zzab.zzb(zzj.zzb('/')).zzd(strZzb);
        String str2 = listZzd.size() != 4 ? null : (String) listZzd.get(3);
        if (TextUtils.isEmpty(str2)) {
            return Tasks.forException(new Exception("Invalid siteKey format ".concat(String.valueOf(strZzb))));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant ".concat(String.valueOf(str)));
        }
        jVar.f108b = zzahaVar;
        n9.g gVar = (n9.g) jVar.f109c;
        gVar.a();
        Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient((Application) gVar.f7359a, str2);
        ((HashMap) jVar.f107a).put(str, tasksClient);
        return tasksClient;
    }

    public String toString() {
        switch (this.f8444a) {
            case 2:
                String string = "[ ";
                if (((u.f) this.f8445b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbB = u.e.b(string);
                        sbB.append(((u.f) this.f8445b).f8747s[i]);
                        sbB.append(" ");
                        string = sbB.toString();
                    }
                }
                StringBuilder sbC = u.e.c(string, "] ");
                sbC.append((u.f) this.f8445b);
                return sbC.toString();
            case 15:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                x3.c cVar = (x3.c) this.f8445b;
                x3.c cVar2 = cVar.f10265c;
                boolean z4 = false;
                while (!cVar2.equals(cVar)) {
                    sb2.append('{');
                    sb2.append(cVar2.f10263a);
                    sb2.append(':');
                    ArrayList arrayList = cVar2.f10264b;
                    sb2.append(arrayList != null ? arrayList.size() : 0);
                    sb2.append("}, ");
                    cVar2 = cVar2.f10265c;
                    z4 = true;
                }
                if (z4) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void u(Context context, XmlResourceParser xmlResourceParser) {
        z.m mVar = new z.m();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    z.h hVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (hVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        hVarD.f10785d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (hVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        hVarD.f10784c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        hVarD = z.m.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (hVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        hVarD.f10783b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (hVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        hVarD.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        hVarD = z.m.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        hVarD.f10785d.f10788a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (hVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        z.a.a(context, xmlResourceParser, hVarD.f10786f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        hVarD = z.m.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        hVarD.f10785d.f10801h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (hVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        z.a.a(context, xmlResourceParser, hVarD.f10786f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        hVarD = z.m.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        mVar.f10851c.put(Integer.valueOf(hVarD.f10782a), hVarD);
                                        hVarD = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        mVar.f10851c.put(Integer.valueOf(hVarD.f10782a), hVarD);
                                        hVarD = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        mVar.f10851c.put(Integer.valueOf(hVarD.f10782a), hVarD);
                                        hVarD = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.f8446c).put(identifier, mVar);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e4) {
                    e4.printStackTrace();
                }
                ((SparseArray) this.f8446c).put(identifier, mVar);
                return;
            }
        }
    }

    public s v(w0 w0Var, int i) {
        i1 i1Var;
        s sVar;
        r.k kVar = (r.k) this.f8445b;
        int iD = kVar.d(w0Var);
        if (iD >= 0 && (i1Var = (i1) kVar.j(iD)) != null) {
            int i10 = i1Var.f10110a;
            if ((i10 & i) != 0) {
                int i11 = i10 & (~i);
                i1Var.f10110a = i11;
                if (i == 4) {
                    sVar = i1Var.f10111b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    sVar = i1Var.f10112c;
                }
                if ((i11 & 12) == 0) {
                    kVar.h(iD);
                    i1Var.f10110a = 0;
                    i1Var.f10111b = null;
                    i1Var.f10112c = null;
                    i1.f10109d.b(i1Var);
                }
                return sVar;
            }
        }
        return null;
    }

    public void w(x3.h hVar, Object obj) {
        HashMap map = (HashMap) this.f8446c;
        x3.c cVar = (x3.c) map.get(hVar);
        if (cVar == null) {
            cVar = new x3.c(hVar);
            cVar.f10266d = cVar;
            x3.c cVar2 = (x3.c) this.f8445b;
            cVar.f10266d = cVar2.f10266d;
            cVar.f10265c = cVar2;
            cVar2.f10266d = cVar;
            cVar.f10266d.f10265c = cVar;
            map.put(hVar, cVar);
        } else {
            hVar.a();
        }
        if (cVar.f10264b == null) {
            cVar.f10264b = new ArrayList();
        }
        cVar.f10264b.add(obj);
    }

    public void x(String str) {
        y3.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f8445b).get(str);
                p4.f.c(obj, "Argument must not be null");
                bVar = (y3.b) obj;
                int i = bVar.f10546b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f10546b);
                }
                int i10 = i - 1;
                bVar.f10546b = i10;
                if (i10 == 0) {
                    y3.b bVar2 = (y3.b) ((HashMap) this.f8445b).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    v1.d dVar = (v1.d) this.f8446c;
                    synchronized (((ArrayDeque) dVar.f9128a)) {
                        try {
                            if (((ArrayDeque) dVar.f9128a).size() < 10) {
                                ((ArrayDeque) dVar.f9128a).offer(bVar2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bVar.f10545a.unlock();
    }

    public void y() {
        try {
            ((FileLock) this.f8446c).release();
            ((FileChannel) this.f8445b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void z(w0 w0Var) {
        i1 i1Var = (i1) ((r.k) this.f8445b).get(w0Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f10110a &= -2;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public String zza(String str) {
        Map map = (Map) ((v0) this.f8446c).f11396d.get((String) this.f8445b);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }

    public /* synthetic */ j(int i, boolean z4) {
        this.f8444a = i;
    }

    public /* synthetic */ j(Object obj, int i) {
        this.f8444a = i;
        this.f8446c = obj;
    }

    public /* synthetic */ j(Object obj, Object obj2, int i, boolean z4) {
        this.f8444a = i;
        this.f8446c = obj;
        this.f8445b = obj2;
    }

    public /* synthetic */ j(boolean z4) {
        this.f8444a = 16;
    }

    public j(Context context, String str, int i) {
        zzmj zzmjVarZzg;
        this.f8444a = i;
        switch (i) {
            case 10:
                this.f8445b = str;
                try {
                    zzla.zza();
                    zzmh zzmhVar = new zzmh();
                    zzmhVar.zzf(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str);
                    zzmhVar.zzd(zzlf.zza);
                    zzmhVar.zze("android-keystore://firebear_master_key_id." + str);
                    zzmjVarZzg = zzmhVar.zzg();
                } catch (IOException | GeneralSecurityException e) {
                    Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e.getMessage())));
                    zzmjVarZzg = null;
                }
                this.f8446c = zzmjVarZzg;
                break;
            default:
                i0.i(context);
                i0.e(str);
                this.f8445b = context.getApplicationContext().getSharedPreferences("com.google.firebase.auth.api.Store." + str, 0);
                this.f8446c = new j7.a("StorageHelpers", new String[0]);
                break;
        }
    }

    public j(y7.a aVar, j jVar) {
        this.f8444a = 1;
        this.f8446c = jVar;
        aVar.f10615a.zzC(new s9.c(this, 0));
        this.f8445b = new HashSet();
    }

    public j(String str, int i) {
        this.f8444a = i;
        switch (i) {
            case 25:
                this.f8445b = str;
                break;
            default:
                this.f8445b = str.concat(".lck");
                break;
        }
    }

    public j(androidx.activity.a0 a0Var) {
        this.f8444a = 21;
        this.f8445b = new AtomicInteger(0);
        this.f8446c = new AtomicBoolean(false);
    }

    public j(int i) {
        this.f8444a = i;
        switch (i) {
            case 11:
                this.f8445b = new SparseIntArray();
                this.f8446c = new SparseIntArray();
                break;
            case 12:
            case 13:
            case 17:
            default:
                this.f8445b = new y();
                this.f8446c = new e3.k();
                C(r.f8557n);
                break;
            case 14:
                this.f8445b = new r.k(0);
                this.f8446c = new r.h();
                break;
            case 15:
                this.f8445b = new x3.c(null);
                this.f8446c = new HashMap();
                break;
            case 16:
                this.f8445b = Boolean.FALSE;
                break;
            case 18:
                this.f8445b = new HashMap();
                this.f8446c = new v1.d();
                break;
            case 19:
                this.f8445b = new p4.j(1000L);
                this.f8446c = q4.d.a(10, new r7.k());
                break;
        }
    }

    public j(m mVar, g2.b bVar) {
        this.f8444a = 17;
        jc.i.e(bVar, "actual");
        this.f8446c = mVar;
        this.f8445b = bVar;
    }

    public j(h1 h1Var) {
        this.f8444a = 13;
        this.f8445b = h1Var;
        g1 g1Var = new g1();
        g1Var.f10074a = 0;
        this.f8446c = g1Var;
    }
}
