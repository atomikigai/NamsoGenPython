package n9;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewFeature;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.zzbbs;
import d4.w;
import da.v;
import ic.l;
import ic.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pc.o;
import rc.b0;
import ub.k;
import y1.y;
import y1.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void B(TextView textView, int i, int i10) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{R.attr.state_selected}, f(textView, i10, i));
        stateListAnimator.addState(new int[0], f(textView, i, i10));
        textView.setStateListAnimator(stateListAnimator);
        textView.refreshDrawableState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void C(p pVar, rc.a aVar, rc.a aVar2) {
        try {
            wc.a.h(k.f9073a, qd.b.r(((ac.a) pVar).create(aVar, aVar2)));
        } catch (Throwable th) {
            aVar2.resumeWith(r7.g.m(th));
            throw th;
        }
    }

    public static final String D(String str) {
        jc.i.e(str, "<this>");
        int i = 0;
        int i10 = -1;
        if (!pc.g.f0(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                jc.i.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                jc.i.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                jc.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = lowerCase.charAt(i11);
                    if (jc.i.f(cCharAt, 31) <= 0 || jc.i.f(cCharAt, 127) >= 0 || pc.g.j0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressI = (o.e0(str, "[", false) && o.Z(str, "]")) ? i(1, str.length() - 1, str) : i(0, str.length(), str);
        if (inetAddressI == null) {
            return null;
        }
        byte[] address = inetAddressI.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressI.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        od.f fVar = new od.f();
        while (i < address.length) {
            if (i == i10) {
                fVar.V(58);
                i += i13;
                if (i == 16) {
                    fVar.V(58);
                }
            } else {
                if (i > 0) {
                    fVar.V(58);
                }
                byte b10 = address[i];
                byte[] bArr = cd.b.f1822a;
                fVar.W(((b10 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return fVar.E(fVar.f7734b, pc.a.f7846a);
    }

    public static int E(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i) {
                return i11;
            }
        }
        return 1;
    }

    public static final void a(ed.a aVar, ed.c cVar, String str) {
        ed.d.h.getClass();
        ed.d.f3545j.fine(cVar.f3541b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3535a);
    }

    public static wb.i b(wb.i iVar) {
        wb.f fVar = iVar.f9913a;
        fVar.b();
        fVar.f9908x = true;
        if (fVar.f9904t <= 0) {
            jc.i.c(wb.f.f9896y, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return fVar.f9904t > 0 ? iVar : wb.i.f9912b;
    }

    public static void c(long j4, od.f fVar, int i, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j10;
        int i14;
        int i15 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 >= i11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i16 = i10; i16 < i11; i16++) {
            if (((od.i) arrayList4.get(i16)).a() < i15) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        od.i iVar = (od.i) arrayList.get(i10);
        od.i iVar2 = (od.i) arrayList4.get(i11 - 1);
        if (i15 == iVar.a()) {
            int iIntValue = ((Number) arrayList5.get(i10)).intValue();
            int i17 = i10 + 1;
            od.i iVar3 = (od.i) arrayList4.get(i17);
            i12 = i17;
            i13 = iIntValue;
            iVar = iVar3;
        } else {
            i12 = i10;
            i13 = -1;
        }
        if (iVar.d(i15) == iVar2.d(i15)) {
            int iMin = Math.min(iVar.a(), iVar2.a());
            int i18 = 0;
            for (int i19 = i15; i19 < iMin && iVar.d(i19) == iVar2.d(i19); i19++) {
                i18++;
            }
            long j11 = 4;
            long j12 = (fVar.f7734b / j11) + j4 + ((long) 2) + ((long) i18) + 1;
            fVar.X(-i18);
            fVar.X(i13);
            int i20 = i15 + i18;
            while (i15 < i20) {
                fVar.X(iVar.d(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i20 != ((od.i) arrayList4.get(i12)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.X(((Number) arrayList5.get(i12)).intValue());
                return;
            } else {
                od.f fVar2 = new od.f();
                fVar.X(((int) ((fVar2.f7734b / j11) + j12)) * (-1));
                c(j12, fVar2, i20, arrayList4, i12, i11, arrayList5);
                fVar.U(fVar2);
                return;
            }
        }
        int i21 = 1;
        for (int i22 = i12 + 1; i22 < i11; i22++) {
            if (((od.i) arrayList4.get(i22 - 1)).d(i15) != ((od.i) arrayList4.get(i22)).d(i15)) {
                i21++;
            }
        }
        long j13 = 4;
        long j14 = (fVar.f7734b / j13) + j4 + ((long) 2) + ((long) (i21 * 2));
        fVar.X(i21);
        fVar.X(i13);
        for (int i23 = i12; i23 < i11; i23++) {
            int iD = ((od.i) arrayList4.get(i23)).d(i15);
            if (i23 == i12 || iD != ((od.i) arrayList4.get(i23 - 1)).d(i15)) {
                fVar.X(iD & 255);
            }
        }
        od.f fVar3 = new od.f();
        int i24 = i12;
        while (i24 < i11) {
            byte bD = ((od.i) arrayList4.get(i24)).d(i15);
            int i25 = i24 + 1;
            int i26 = i25;
            while (true) {
                if (i26 >= i11) {
                    i26 = i11;
                    break;
                } else if (bD != ((od.i) arrayList4.get(i26)).d(i15)) {
                    break;
                } else {
                    i26++;
                }
            }
            if (i25 == i26 && i15 + 1 == ((od.i) arrayList4.get(i24)).a()) {
                fVar.X(((Number) arrayList5.get(i24)).intValue());
                arrayList3 = arrayList5;
                j10 = j14;
                i14 = i26;
            } else {
                fVar.X(((int) ((fVar3.f7734b / j13) + j14)) * (-1));
                arrayList3 = arrayList5;
                j10 = j14;
                i14 = i26;
                c(j10, fVar3, i15 + 1, arrayList, i24, i14, arrayList3);
                arrayList4 = arrayList;
            }
            j14 = j10;
            i24 = i14;
            arrayList5 = arrayList3;
        }
        fVar.U(fVar3);
    }

    public static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public static boolean e(long j4) {
        Object objM;
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
            StringBuilder sbL = v.l("jar #", " NO limpiado: MULTI_PROFILE no soportado (", j4);
            sbL.append(Build.VERSION.SDK_INT);
            sbL.append(')');
            Log.w("KRYPT-PROXY", sbL.toString());
            return false;
        }
        try {
            Profile orCreateProfile = ProfileStore.getInstance().getOrCreateProfile(s(j4));
            jc.i.d(orCreateProfile, "getOrCreateProfile(...)");
            orCreateProfile.getCookieManager().removeAllCookies(null);
            orCreateProfile.getCookieManager().flush();
            orCreateProfile.getWebStorage().deleteAllData();
            Log.i("KRYPT-PROXY", "jar #" + j4 + " LIMPIADO (cookies+storage)");
            objM = Boolean.TRUE;
        } catch (Throwable th) {
            objM = r7.g.m(th);
        }
        Throwable thA = ub.h.a(objM);
        if (thA != null) {
            StringBuilder sbL2 = v.l("limpieza del jar #", " falló: ", j4);
            sbL2.append(thA.getMessage());
            Log.w("KRYPT-PROXY", sbL2.toString());
            objM = Boolean.FALSE;
        }
        return ((Boolean) objM).booleanValue();
    }

    public static final ValueAnimator f(TextView textView, int i, int i10) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i10));
        valueAnimatorOfObject.setDuration(350L);
        valueAnimatorOfObject.addUpdateListener(new g9.i(textView, 1));
        return valueAnimatorOfObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] g(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static int h(boolean z4, String str, int i, int i10) {
        while (i < i10) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z4)) {
                return i;
            }
            i++;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final InetAddress i(int i, int i10, String str) {
        int i11;
        int i12;
        int iQ;
        byte[] bArr = new byte[16];
        int i13 = i;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (i13 < i10) {
            if (i14 == 16) {
                return null;
            }
            int i17 = i13 + 2;
            if (i17 <= i10 && o.d0(str, i13, "::", false)) {
                if (i15 != -1) {
                    return null;
                }
                i14 += 2;
                i15 = i14;
                if (i17 == i10) {
                    break;
                }
                i16 = i17;
                i11 = 0;
                i13 = i16;
                while (i13 < i10) {
                    iQ = cd.b.q(str.charAt(i13));
                    if (iQ != -1) {
                        break;
                        break;
                    }
                    i11 = (i11 << 4) + iQ;
                    i13++;
                }
                i12 = i13 - i16;
                return i12 == 0 ? null : null;
            }
            if (i14 != 0) {
                if (!o.d0(str, i13, ":", false)) {
                    if (!o.d0(str, i13, ".", false)) {
                        return null;
                    }
                    int i18 = i14 - 2;
                    int i19 = i18;
                    while (i16 < i10) {
                        if (i19 == 16) {
                            return null;
                        }
                        if (i19 != i18) {
                            if (str.charAt(i16) != '.') {
                                return null;
                            }
                            i16++;
                        }
                        int i20 = 0;
                        int i21 = i16;
                        while (i21 < i10) {
                            char cCharAt = str.charAt(i21);
                            if (jc.i.f(cCharAt, 48) < 0 || jc.i.f(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i20 == 0 && i16 != i21) || (i20 = ((i20 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i21++;
                        }
                        if (i21 - i16 == 0) {
                            return null;
                        }
                        bArr[i19] = (byte) i20;
                        i19++;
                        i16 = i21;
                    }
                    if (i19 != i14 + 2) {
                        return null;
                    }
                    i14 += 2;
                    break;
                }
                i13++;
            }
            i16 = i13;
            i11 = 0;
            i13 = i16;
            while (i13 < i10) {
                iQ = cd.b.q(str.charAt(i13));
                if (iQ != -1) {
                    break;
                }
                i11 = (i11 << 4) + iQ;
                i13++;
            }
            i12 = i13 - i16;
            if (i12 == 0 && i12 <= 4) {
                int i22 = i14 + 1;
                bArr[i14] = (byte) (255 & (i11 >>> 8));
                i14 += 2;
                bArr[i22] = (byte) (i11 & 255);
            }
        }
        if (i14 != 16) {
            if (i15 == -1) {
                return null;
            }
            int i23 = i14 - i15;
            System.arraycopy(bArr, i15, bArr, 16 - i23, i23);
            Arrays.fill(bArr, i15, (16 - i14) + i15, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static boolean j(long j4) {
        Object objM;
        try {
            if (!WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
                Log.w("KRYPT-PROXY", "jar #" + j4 + " NO incinerado: MULTI_PROFILE no soportado (" + Build.VERSION.SDK_INT + ')');
                return false;
            }
            boolean zDeleteProfile = ProfileStore.getInstance().deleteProfile(s(j4));
            Log.i("KRYPT-PROXY", "jar #" + j4 + " incinerado → ok=" + zDeleteProfile);
            objM = Boolean.valueOf(zDeleteProfile);
            Throwable thA = ub.h.a(objM);
            if (thA != null) {
                StringBuilder sbL = v.l("incineración del jar #", " falló: ", j4);
                sbL.append(thA.getMessage());
                Log.w("KRYPT-PROXY", sbL.toString());
                objM = Boolean.FALSE;
            }
            return ((Boolean) objM).booleanValue();
        } catch (Throwable th) {
            objM = r7.g.m(th);
        }
    }

    public static final void k(g2.a aVar) {
        jc.i.e(aVar, "connection");
        wb.c cVar = new wb.c(10);
        g2.c cVarR = aVar.R("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarR.O()) {
            try {
                cVar.add(cVarR.F(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    a.a.b(cVarR, th);
                    throw th2;
                }
            }
        }
        a.a.b(cVarR, null);
        ListIterator listIterator = jd.d.c(cVar).listIterator(0);
        while (true) {
            wb.a aVar2 = (wb.a) listIterator;
            if (!aVar2.hasNext()) {
                return;
            }
            String str = (String) aVar2.next();
            if (o.e0(str, "room_fts_content_sync_", false)) {
                jd.d.o(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final String l(long j4) {
        String strL;
        if (j4 <= -999500000) {
            strL = q1.a.l(new StringBuilder(), (j4 - ((long) 500000000)) / ((long) 1000000000), " s ");
        } else if (j4 <= -999500) {
            strL = q1.a.l(new StringBuilder(), (j4 - ((long) 500000)) / ((long) 1000000), " ms");
        } else if (j4 <= 0) {
            strL = q1.a.l(new StringBuilder(), (j4 - ((long) 500)) / ((long) zzbbs.zzq.zzf), " µs");
        } else if (j4 < 999500) {
            strL = q1.a.l(new StringBuilder(), (j4 + ((long) 500)) / ((long) zzbbs.zzq.zzf), " µs");
        } else {
            strL = j4 < 999500000 ? q1.a.l(new StringBuilder(), (j4 + ((long) 500000)) / ((long) 1000000), " ms") : q1.a.l(new StringBuilder(), (j4 + ((long) 500000000)) / ((long) 1000000000), " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strL}, 1));
    }

    public static final yb.i m(y1.v vVar, boolean z4, ac.c cVar) {
        if (!vVar.l()) {
            wc.e eVar = vVar.f10515a;
            if (eVar != null) {
                return eVar.f9927a;
            }
            jc.i.i("coroutineScope");
            throw null;
        }
        if (cVar.getContext().H(z.f10536a) != null) {
            throw new ClassCastException();
        }
        if (z4) {
            yb.i iVar = vVar.f10516b;
            if (iVar != null) {
                return iVar;
            }
            jc.i.i("transactionContext");
            throw null;
        }
        wc.e eVar2 = vVar.f10515a;
        if (eVar2 != null) {
            return eVar2.f9927a;
        }
        jc.i.i("coroutineScope");
        throw null;
    }

    public static d7.a n(Application application) {
        z6.c cVar = new z6.c(16);
        cVar.f8445b = Boolean.TRUE;
        return new d7.a(application, new z6.d(cVar));
    }

    public static int o(List list, InputStream inputStream, x3.f fVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iC = ((u3.e) list.get(i)).c(inputStream, fVar);
                inputStream.reset();
                if (iC != -1) {
                    return iC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType p(List list, InputStream inputStream, x3.f fVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ((u3.e) list.get(i)).d(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeD;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType q(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((u3.e) list.get(i)).a(byteBuffer);
                AtomicReference atomicReference = p4.b.f7790a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = p4.b.f7790a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static i2.d r(e7.i iVar, SQLiteDatabase sQLiteDatabase) {
        jc.i.e(iVar, "refHolder");
        i2.d dVar = (i2.d) iVar.f3489b;
        if (dVar != null && dVar.f5135a.equals(sQLiteDatabase)) {
            return dVar;
        }
        i2.d dVar2 = new i2.d(sQLiteDatabase);
        iVar.f3489b = dVar2;
        return dVar2;
    }

    public static String s(long j4) {
        return v.g("krypt_p_", j4);
    }

    public static Profile t(long j4) {
        Object objM;
        try {
            if (!WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
                return null;
            }
            objM = ProfileStore.getInstance().getOrCreateProfile(s(j4));
        } catch (Throwable th) {
            objM = r7.g.m(th);
        }
        return (Profile) (objM instanceof ub.g ? null : objM);
    }

    public static void u(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long v(int i, String str) {
        int iH = h(false, str, 0, i);
        Matcher matcher = bd.j.f1606m.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int iK0 = -1;
        int i13 = -1;
        int i14 = -1;
        while (iH < i) {
            int iH2 = h(true, str, iH + 1, i);
            matcher.region(iH, iH2);
            if (i11 == -1 && matcher.usePattern(bd.j.f1606m).matches()) {
                String strGroup = matcher.group(1);
                jc.i.d(strGroup, "matcher.group(1)");
                i11 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                jc.i.d(strGroup2, "matcher.group(2)");
                i13 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                jc.i.d(strGroup3, "matcher.group(3)");
                i14 = Integer.parseInt(strGroup3);
            } else if (i12 == -1 && matcher.usePattern(bd.j.f1605l).matches()) {
                String strGroup4 = matcher.group(1);
                jc.i.d(strGroup4, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup4);
            } else if (iK0 == -1) {
                Pattern pattern = bd.j.f1604k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    jc.i.d(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    jc.i.d(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    jc.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    jc.i.d(strPattern, "MONTH_PATTERN.pattern()");
                    iK0 = pc.g.k0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i10 != -1 && matcher.usePattern(bd.j.f1603j).matches()) {
                    String strGroup6 = matcher.group(1);
                    jc.i.d(strGroup6, "matcher.group(1)");
                    i10 = Integer.parseInt(strGroup6);
                }
            } else if (i10 != -1) {
            }
            iH = h(false, str, iH2 + 1, i);
        }
        if (70 <= i10 && i10 < 100) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 < 70) {
            i10 += 2000;
        }
        if (i10 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iK0 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i12 || i12 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0 || i11 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(cd.b.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, iK0 - 1);
        gregorianCalendar.set(5, i12);
        gregorianCalendar.set(11, i11);
        gregorianCalendar.set(12, i13);
        gregorianCalendar.set(13, i14);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object w(l lVar, y1.v vVar, yb.d dVar, boolean z4, boolean z10) {
        e2.b bVar;
        l lVar2;
        y1.v vVar2;
        boolean z11;
        boolean z12;
        if (dVar instanceof e2.b) {
            bVar = (e2.b) dVar;
            int i = bVar.f3218f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f3218f = i - Integer.MIN_VALUE;
            } else {
                bVar = new e2.b(dVar);
            }
        } else {
            bVar = new e2.b(dVar);
        }
        e2.b bVar2 = bVar;
        Object obj = bVar2.e;
        zb.a aVar = zb.a.f11555a;
        int i10 = bVar2.f3218f;
        if (i10 == 0) {
            r7.g.G(obj);
            if (vVar.l() && vVar.p() && vVar.m()) {
                e2.c cVar = new e2.c(lVar, vVar, null, z10, z4);
                bVar2.f3218f = 1;
                Object objR = vVar.r(z4, cVar, bVar2);
                if (objR != aVar) {
                    return objR;
                }
            } else {
                bVar2.f3214a = vVar;
                bVar2.f3215b = lVar;
                bVar2.f3216c = z4;
                bVar2.f3217d = z10;
                bVar2.f3218f = 2;
                yb.i iVarM = m(vVar, z10, bVar2);
                if (iVarM != aVar) {
                    lVar2 = lVar;
                    vVar2 = vVar;
                    obj = iVarM;
                    z11 = z10;
                    z12 = z4;
                }
            }
        }
        if (i10 == 1) {
            r7.g.G(obj);
            return obj;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7.g.G(obj);
            return obj;
        }
        boolean z13 = bVar2.f3217d;
        boolean z14 = bVar2.f3216c;
        l lVar3 = bVar2.f3215b;
        y1.v vVar3 = bVar2.f3214a;
        r7.g.G(obj);
        z11 = z13;
        z12 = z14;
        lVar2 = lVar3;
        vVar2 = vVar3;
        e2.a aVar2 = new e2.a(lVar2, vVar2, null, z12, z11);
        bVar2.f3214a = null;
        bVar2.f3215b = null;
        bVar2.f3218f = 3;
        Object objY = b0.y((yb.i) obj, aVar2, bVar2);
        return objY == aVar ? aVar : objY;
    }

    public static final Cursor x(y1.v vVar, y yVar) {
        jc.i.e(vVar, "db");
        vVar.a();
        vVar.b();
        return vVar.i().z().p(yVar);
    }

    public static f1.b y(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j4;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                j4 = -1;
                break;
            }
            int i11 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j4 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j4 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i12 = 0; i12 < j10; i12++) {
                int i13 = byteBufferDuplicate.getInt();
                long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    byteBufferDuplicate.position((int) (j11 + j4));
                    f1.b bVar = new f1.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f3578d = byteBufferDuplicate;
                    bVar.f3575a = iPosition;
                    int i14 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f3576b = i14;
                    bVar.f3577c = ((ByteBuffer) bVar.f3578d).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public abstract void A(boolean z4);

    public void z(boolean z4) {
    }
}
