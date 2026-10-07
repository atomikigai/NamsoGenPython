package z7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzpq;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends f1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f11081r = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f11082s = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f11083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f11084d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f11085f;

    public d3(a1 a1Var) {
        super(a1Var);
        this.f11085f = null;
        this.f11084d = new AtomicLong(0L);
    }

    public static boolean L(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean O(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean P(String str) {
        com.google.android.gms.common.internal.i0.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean Q(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.i0.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean R(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            com.google.android.gms.common.internal.i0.i(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static byte[] S(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final boolean T(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean W(String str, String[] strArr) {
        com.google.android.gms.common.internal.i0.i(strArr);
        for (Object obj : strArr) {
            if (str == obj) {
                return true;
            }
            if (str != null && str.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static long d0(byte[] bArr) {
        com.google.android.gms.common.internal.i0.i(bArr);
        int length = bArr.length;
        int i = 0;
        com.google.android.gms.common.internal.i0.l(length > 0);
        long j4 = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j4 += (((long) bArr[i10]) & 255) << i;
            i += 8;
        }
        return j4;
    }

    public static String j(String str, int i, boolean z4) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z4) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
        }
        return null;
    }

    public static MessageDigest k() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList m(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", cVar.f11037a);
            bundle.putString("origin", cVar.f11038b);
            bundle.putLong("creation_timestamp", cVar.f11040d);
            bundle.putString("name", cVar.f11039c.f11015b);
            Object objZza = cVar.f11039c.zza();
            com.google.android.gms.common.internal.i0.i(objZza);
            k1.g(objZza, bundle);
            bundle.putBoolean("active", cVar.e);
            String str = cVar.f11041f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            q qVar = cVar.f11042r;
            if (qVar != null) {
                bundle.putString("timed_out_event_name", qVar.f11302a);
                p pVar = qVar.f11303b;
                if (pVar != null) {
                    bundle.putBundle("timed_out_event_params", pVar.g());
                }
            }
            bundle.putLong("trigger_timeout", cVar.f11043s);
            q qVar2 = cVar.f11044t;
            if (qVar2 != null) {
                bundle.putString("triggered_event_name", qVar2.f11302a);
                p pVar2 = qVar2.f11303b;
                if (pVar2 != null) {
                    bundle.putBundle("triggered_event_params", pVar2.g());
                }
            }
            bundle.putLong("triggered_timestamp", cVar.f11039c.f11016c);
            bundle.putLong("time_to_live", cVar.f11045u);
            q qVar3 = cVar.f11046v;
            if (qVar3 != null) {
                bundle.putString("expired_event_name", qVar3.f11302a);
                p pVar3 = qVar3.f11303b;
                if (pVar3 != null) {
                    bundle.putBundle("expired_event_params", pVar3.g());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void p(b2 b2Var, Bundle bundle, boolean z4) {
        if (bundle != null && b2Var != null) {
            if (!bundle.containsKey("_sc") || z4) {
                String str = b2Var.f11028a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = b2Var.f11029b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", b2Var.f11030c);
                return;
            }
            z4 = false;
        }
        if (bundle != null && b2Var == null && z4) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void t(c3 c3Var, String str, int i, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        T(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i10);
        }
        c3Var.zza(str, bundle);
    }

    public final void A(zzcf zzcfVar, long j4) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j4);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error returning long value to wrapper");
        }
    }

    public final void B(String str, zzcf zzcfVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    public final void C(String str, String str2, Bundle bundle, List list, boolean z4) {
        int i;
        int iA0;
        int iF;
        list = list;
        a1 a1Var = (a1) this.f159a;
        if (bundle == null) {
            return;
        }
        g gVar = a1Var.f11005r;
        i0 i0Var = a1Var.f11007t;
        e0 e0Var = a1Var.f11011x;
        zzpq.zzc();
        int i10 = 231100000;
        if (((a1) gVar.f159a).f11005r.l(null, z.f11480s0)) {
            d3 d3Var = ((a1) gVar.f159a).f11010w;
            a1.d(d3Var);
            if (d3Var.N(231100000)) {
                i = 35;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        int i11 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iA0 = !z4 ? a0(str3) : 0;
                if (iA0 == 0) {
                    iA0 = Z(str3);
                }
            } else {
                iA0 = 0;
            }
            if (iA0 != 0) {
                o(bundle, iA0, str3, iA0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (L(bundle.get(str3))) {
                    a1.f(i0Var);
                    i0Var.f11195v.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iF = 22;
                } else {
                    iF = F(str, str3, bundle.get(str3), bundle, list, z4, false);
                }
                if (iF == 0 || "_ev".equals(str3)) {
                    if (P(str3) && !W(str3, k1.h)) {
                        int i12 = i11 + 1;
                        if (!N(i10)) {
                            a1.f(i0Var);
                            i0Var.f11192s.d(e0Var.d(str), "Item array not supported on client's version of Google Play Services (Android Only)", e0Var.b(bundle));
                            T(23, bundle);
                            bundle.remove(str3);
                        } else if (i12 > i) {
                            zzpq.zzc();
                            if (a1Var.f11005r.l(null, z.f11480s0)) {
                                a1.f(i0Var);
                                i0Var.f11192s.d(e0Var.d(str), q1.a.j(i, "Item can't contain more than ", " item-scoped custom params"), e0Var.b(bundle));
                                T(28, bundle);
                                bundle.remove(str3);
                            } else {
                                a1.f(i0Var);
                                i0Var.f11192s.d(e0Var.d(str), "Item cannot contain custom parameters", e0Var.b(bundle));
                                T(23, bundle);
                                bundle.remove(str3);
                            }
                        }
                        i11 = i12;
                    }
                    i10 = 231100000;
                } else {
                    o(bundle, iF, str3, bundle.get(str3));
                    bundle.remove(str3);
                }
            }
            i10 = 231100000;
        }
    }

    public final boolean D(String str, String str2) {
        a1 a1Var = (a1) this.f159a;
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.common.internal.i0.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(a1Var.f11001b)) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11192s.c(i0.k(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                return false;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                com.google.android.gms.common.internal.i0.i(str2);
                if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    return true;
                }
                i0 i0Var2 = a1Var.f11007t;
                a1.f(i0Var2);
                i0Var2.f11192s.c(i0.k(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            if (TextUtils.isEmpty(a1Var.f11001b)) {
                i0 i0Var3 = a1Var.f11007t;
                a1.f(i0Var3);
                i0Var3.f11192s.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean E(int i, String str, String str2) {
        a1 a1Var = (a1) this.f159a;
        if (str2 == null) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11192s.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        i0 i0Var2 = a1Var.f11007t;
        a1.f(i0Var2);
        i0Var2.f11192s.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final int F(String str, String str2, Object obj, Bundle bundle, List list, boolean z4, boolean z10) {
        int i;
        int i10;
        int size;
        a1 a1Var = (a1) this.f159a;
        c();
        int i11 = 0;
        if (!L(obj)) {
            i = 0;
        } else {
            if (!z10) {
                return 21;
            }
            if (!W(str2, k1.f11234g)) {
                return 20;
            }
            k2 k2VarN = a1Var.n();
            k2VarN.c();
            k2VarN.d();
            if (k2VarN.l()) {
                d3 d3Var = ((a1) k2VarN.f159a).f11010w;
                a1.d(d3Var);
                if (d3Var.c0() < 200900) {
                    return 25;
                }
            }
            boolean z11 = obj instanceof Parcelable[];
            if (z11) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11195v.e("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z11) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        if (O(str) || O(str2)) {
            a1Var.getClass();
            i10 = 256;
        } else {
            a1Var.getClass();
            i10 = 100;
        }
        if (!H("param", str2, i10, obj)) {
            if (!z10) {
                return 4;
            }
            if (obj instanceof Bundle) {
                C(str, str2, (Bundle) obj, list, z4);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i11 < length) {
                    Parcelable parcelable = parcelableArr2[i11];
                    if (!(parcelable instanceof Bundle)) {
                        i0 i0Var2 = a1Var.f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11195v.d(parcelable.getClass(), "All Parcelable[] elements must be of type Bundle. Value type, name", str2);
                        return 4;
                    }
                    C(str, str2, (Bundle) parcelable, list, z4);
                    i11++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    if (!(obj2 instanceof Bundle)) {
                        i0 i0Var3 = a1Var.f11007t;
                        a1.f(i0Var3);
                        i0Var3.f11195v.d(obj2 != null ? obj2.getClass() : "null", "All ArrayList elements must be of type Bundle. Value type, name", str2);
                        return 4;
                    }
                    C(str, str2, (Bundle) obj2, list, z4);
                    i11++;
                }
            }
        }
        return i;
    }

    public final boolean G(String str, String[] strArr, String[] strArr2, String str2) {
        a1 a1Var = (a1) this.f159a;
        if (str2 == null) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11192s.c(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f11081r[i])) {
                i0 i0Var2 = a1Var.f11007t;
                a1.f(i0Var2);
                i0Var2.f11192s.d(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !W(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && W(str2, strArr2)) {
            return true;
        }
        i0 i0Var3 = a1Var.f11007t;
        a1.f(i0Var3);
        i0Var3.f11192s.d(str, "Name is reserved. Type, name", str2);
        return false;
    }

    public final boolean H(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11195v.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final boolean I(String str, String str2) {
        a1 a1Var = (a1) this.f159a;
        if (str2 == null) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11192s.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11192s.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                i0 i0Var3 = a1Var.f11007t;
                a1.f(i0Var3);
                i0Var3.f11192s.d(str, "Name must start with a letter or _ (underscore). Type, name", str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                i0 i0Var4 = a1Var.f11007t;
                a1.f(i0Var4);
                i0Var4.f11192s.d(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean J(String str, String str2) {
        a1 a1Var = (a1) this.f159a;
        if (str2 == null) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11192s.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11192s.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            i0 i0Var3 = a1Var.f11007t;
            a1.f(i0Var3);
            i0Var3.f11192s.d(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                i0 i0Var4 = a1Var.f11007t;
                a1.f(i0Var4);
                i0Var4.f11192s.d(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean K(String str) {
        c();
        a1 a1Var = (a1) this.f159a;
        if (((Context) p7.c.a(a1Var.f11000a).f7823a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11197x.c(str, "Permission not granted");
        return false;
    }

    public final boolean M(Context context, String str) {
        Signature[] signatureArr;
        a1 a1Var = (a1) this.f159a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = p7.c.a(context).f(64, str);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.c(e, "Package name not found");
            return true;
        } catch (CertificateException e4) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11190f.c(e4, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean N(int i) {
        Boolean bool = ((a1) this.f159a).n().e;
        if (c0() < i / zzbbs.zzq.zzf) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int U(String str) {
        a1 a1Var = (a1) this.f159a;
        if ("_ldl".equals(str)) {
            a1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            a1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            a1Var.getClass();
            return 100;
        }
        a1Var.getClass();
        return 36;
    }

    public final Object V(int i, Object obj, boolean z4, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return j(obj.toString(), i, z4);
        }
        if (!z10) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleG0 = g0((Bundle) parcelable);
                if (!bundleG0.isEmpty()) {
                    arrayList.add(bundleG0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int X(Object obj, String str) {
        return "_ldl".equals(str) ? H("user property referrer", str, U(str), obj) : H("user property", str, U(str), obj) ? 0 : 7;
    }

    public final int Y(String str) {
        if (!I("event", str)) {
            return 2;
        }
        if (!G("event", k1.f11229a, k1.f11230b, str)) {
            return 13;
        }
        ((a1) this.f159a).getClass();
        return !E(40, "event", str) ? 2 : 0;
    }

    public final int Z(String str) {
        if (!I("event param", str)) {
            return 3;
        }
        if (!G("event param", null, null, str)) {
            return 14;
        }
        ((a1) this.f159a).getClass();
        return !E(40, "event param", str) ? 3 : 0;
    }

    public final int a0(String str) {
        if (!J("event param", str)) {
            return 3;
        }
        if (!G("event param", null, null, str)) {
            return 14;
        }
        ((a1) this.f159a).getClass();
        return !E(40, "event param", str) ? 3 : 0;
    }

    public final int b0(String str) {
        if (!I("user property", str)) {
            return 6;
        }
        if (!G("user property", k1.i, null, str)) {
            return 15;
        }
        ((a1) this.f159a).getClass();
        return !E(24, "user property", str) ? 6 : 0;
    }

    public final int c0() {
        if (this.f11085f == null) {
            g7.f fVar = g7.f.f4241b;
            Context context = ((a1) this.f159a).f11000a;
            fVar.getClass();
            this.f11085f = Integer.valueOf(g7.f.a(context) / zzbbs.zzq.zzf);
        }
        return this.f11085f.intValue();
    }

    @Override // z7.f1
    public final boolean d() {
        return true;
    }

    public final long e0() {
        long andIncrement;
        long j4;
        if (this.f11084d.get() != 0) {
            synchronized (this.f11084d) {
                this.f11084d.compareAndSet(-1L, 1L);
                andIncrement = this.f11084d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f11084d) {
            long jNanoTime = System.nanoTime();
            ((a1) this.f159a).f11012y.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.e + 1;
            this.e = i;
            j4 = jNextLong + ((long) i);
        }
        return j4;
    }

    public final Bundle f0(Uri uri, boolean z4) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("utm_id");
                    queryParameter6 = uri.getQueryParameter("dclid");
                    queryParameter7 = uri.getQueryParameter("srsltid");
                    queryParameter8 = z4 ? uri.getQueryParameter("sfmc_id") : null;
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && (!z4 || TextUtils.isEmpty(queryParameter8))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                String queryParameter9 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("term", queryParameter9);
                }
                String queryParameter10 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("content", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("aclid", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("cp1", queryParameter12);
                }
                String queryParameter13 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString("anid", queryParameter13);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("campaign_id", queryParameter5);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("dclid", queryParameter6);
                }
                String queryParameter14 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString("source_platform", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("creative_format", queryParameter15);
                }
                String queryParameter16 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter16)) {
                    bundle.putString("marketing_tactic", queryParameter16);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("srsltid", queryParameter7);
                }
                if (z4 && !TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("sfmc_id", queryParameter8);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                i0 i0Var = ((a1) this.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11193t.c(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final Object g(Object obj, String str) {
        a1 a1Var = (a1) this.f159a;
        int i = 256;
        if ("_ev".equals(str)) {
            a1Var.getClass();
            return V(256, obj, true, true);
        }
        if (O(str)) {
            a1Var.getClass();
        } else {
            a1Var.getClass();
            i = 100;
        }
        return V(i, obj, false, true);
    }

    public final Bundle g0(Bundle bundle) {
        a1 a1Var = (a1) this.f159a;
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objG = g(bundle.get(str), str);
                if (objG == null) {
                    i0 i0Var = a1Var.f11007t;
                    a1.f(i0Var);
                    i0Var.f11195v.c(a1Var.f11011x.e(str), "Param value can't be null");
                } else {
                    u(bundle2, str, objG);
                }
            }
        }
        return bundle2;
    }

    public final Object h(Object obj, String str) {
        return "_ldl".equals(str) ? V(U(str), obj, true, false) : V(U(str), obj, false, false);
    }

    public final Bundle h0(String str, Bundle bundle, List list, boolean z4) {
        int iA0;
        a1 a1Var = (a1) this.f159a;
        boolean zW = W(str, k1.f11232d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        g gVar = a1Var.f11005r;
        e0 e0Var = a1Var.f11011x;
        d3 d3Var = ((a1) gVar.f159a).f11010w;
        a1.d(d3Var);
        int i = d3Var.N(201500000) ? 100 : 25;
        int i10 = 0;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iA0 = !z4 ? a0(str2) : 0;
                if (iA0 == 0) {
                    iA0 = Z(str2);
                }
            } else {
                iA0 = 0;
            }
            if (iA0 != 0) {
                o(bundle2, iA0, str2, iA0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iF = F(str, str2, bundle.get(str2), bundle2, list, z4, zW);
                if (iF == 17) {
                    o(bundle2, 17, str2, Boolean.FALSE);
                } else if (iF != 0 && !"_ev".equals(str2)) {
                    o(bundle2, iF, iF == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (P(str2) && (i10 = i10 + 1) > i) {
                    String strJ = q1.a.j(i, "Event can't contain more than ", " params");
                    i0 i0Var = a1Var.f11007t;
                    a1.f(i0Var);
                    i0Var.f11192s.d(e0Var.d(str), strJ, e0Var.b(bundle));
                    T(5, bundle2);
                    bundle2.remove(str2);
                }
            }
        }
        return bundle2;
    }

    public final q i0(String str, Bundle bundle, String str2, long j4, boolean z4) {
        a1 a1Var = (a1) this.f159a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (Y(str) != 0) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.c(a1Var.f11011x.f(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleH0 = h0(str, bundle2, Collections.singletonList("_o"), true);
        if (z4) {
            bundleH0 = g0(bundleH0);
        }
        com.google.android.gms.common.internal.i0.i(bundleH0);
        return new q(str, new p(bundleH0), str2, j4);
    }

    public final SecureRandom l() {
        c();
        if (this.f11083c == null) {
            this.f11083c = new SecureRandom();
        }
        return this.f11083c;
    }

    public final void n(Bundle bundle, long j4) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(Long.valueOf(j10), "Params already contained engagement");
        } else {
            j10 = 0;
        }
        bundle.putLong("_et", j4 + j10);
    }

    public final void o(Bundle bundle, int i, String str, Object obj) {
        if (T(i, bundle)) {
            ((a1) this.f159a).getClass();
            bundle.putString("_ev", j(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void q(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                d3 d3Var = ((a1) this.f159a).f11010w;
                a1.d(d3Var);
                d3Var.u(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void r(Parcelable[] parcelableArr, int i, boolean z4) {
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i10 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (P(str) && !W(str, k1.h) && (i10 = i10 + 1) > i) {
                    if (z4) {
                        i0 i0Var = a1Var.f11007t;
                        e0 e0Var = a1Var.f11011x;
                        a1.f(i0Var);
                        i0Var.f11192s.d(e0Var.e(str), q1.a.j(i, "Param can't contain more than ", " item-scoped custom parameters"), e0Var.b(bundle));
                        T(28, bundle);
                    } else {
                        i0 i0Var2 = a1Var.f11007t;
                        e0 e0Var2 = a1Var.f11011x;
                        a1.f(i0Var2);
                        i0Var2.f11192s.d(e0Var2.e(str), "Param cannot contain item-scoped custom parameters", e0Var2.b(bundle));
                        T(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final void s(fd.l lVar, int i) {
        a1 a1Var = (a1) this.f159a;
        Bundle bundle = (Bundle) lVar.e;
        int i10 = 0;
        for (String str : new TreeSet(bundle.keySet())) {
            if (P(str) && (i10 = i10 + 1) > i) {
                String strJ = q1.a.j(i, "Event can't contain more than ", " params");
                i0 i0Var = a1Var.f11007t;
                e0 e0Var = a1Var.f11011x;
                a1.f(i0Var);
                i0Var.f11192s.d(e0Var.d((String) lVar.f3953c), strJ, e0Var.b(bundle));
                T(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void u(Bundle bundle, String str, Object obj) {
        a1 a1Var = (a1) this.f159a;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11195v.d(a1Var.f11011x.e(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    public final void v(zzcf zzcfVar, boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z4);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error returning boolean value to wrapper");
        }
    }

    public final void w(zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error returning bundle list to wrapper");
        }
    }

    public final void x(zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error returning bundle value to wrapper");
        }
    }

    public final void y(zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error returning byte array to wrapper");
        }
    }

    public final void z(zzcf zzcfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error returning int value to wrapper");
        }
    }
}
