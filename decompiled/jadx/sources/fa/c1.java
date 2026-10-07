package fa;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.widget.EdgeEffect;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c1 implements q0.f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f3697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3698b;

    public static int F(int i) {
        int iD = u.e.d(i);
        if (iD == 0) {
            return 0;
        }
        int i10 = 1;
        if (iD != 1) {
            i10 = 2;
            if (iD != 2) {
                i10 = 3;
                if (iD != 3) {
                    i10 = 4;
                    if (iD != 4) {
                        if (iD == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + da.v.x(i) + " to int");
                    }
                }
            }
        }
        return i10;
    }

    public static String G(int i) {
        switch (i) {
            case 0:
                return "Unknown error";
            case 1:
                return "No internet connection";
            case 2:
                return "Play Services update cancelled";
            case 3:
                return "Developer error";
            case 4:
                return "Provider error";
            case 5:
                return "User account merge conflict";
            case 6:
                return "You are are attempting to sign in a different email than previously provided";
            case 7:
                return "You are are attempting to sign in with an invalid email link";
            case 8:
                return "You must open the email link on the same device.";
            case 9:
                return "Please enter your email to continue signing in";
            case 10:
                return "You must determine if you want to continue linking or complete the sign in";
            case 11:
                return "The session associated with this sign-in request has either expired or was cleared";
            case 12:
                return "The user account has been disabled by an administrator.";
            case 13:
                return "Generic IDP recoverable error.";
            default:
                throw new IllegalArgumentException(da.v.f(i, "Unknown code: "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public static final Object d(List list, z0.r rVar, ac.c cVar) throws Throwable {
        z0.c cVar2;
        List list2;
        jc.q qVar;
        Iterator it;
        Throwable th;
        ic.l lVar;
        if (cVar instanceof z0.c) {
            cVar2 = (z0.c) cVar;
            int i = cVar2.f10868d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.f10868d = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new z0.c(cVar);
            }
        } else {
            cVar2 = new z0.c(cVar);
        }
        Object obj = cVar2.f10867c;
        Object obj2 = zb.a.f11555a;
        int i10 = cVar2.f10868d;
        if (i10 != 0) {
            if (i10 == 1) {
                list2 = (List) cVar2.f10865a;
                r7.g.G(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = cVar2.f10866b;
                qVar = (jc.q) cVar2.f10865a;
                try {
                    r7.g.G(obj);
                } catch (Throwable th2) {
                    Object obj3 = qVar.f5776a;
                    if (obj3 == null) {
                        qVar.f5776a = th2;
                    } else {
                        p3.a.a((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                lVar = (ic.l) it.next();
                cVar2.f10865a = qVar;
                cVar2.f10866b = it;
                cVar2.f10868d = 2;
                if (lVar.invoke(cVar2) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) qVar.f5776a;
            if (th == null) {
                return ub.k.f9073a;
            }
            throw th;
        }
        r7.g.G(obj);
        ArrayList arrayList = new ArrayList();
        z0.e eVar = new z0.e(list, arrayList, null);
        cVar2.f10865a = arrayList;
        cVar2.f10868d = 1;
        if (rVar.a(eVar, cVar2) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        qVar = new jc.q();
        it = list2.iterator();
        while (it.hasNext()) {
            lVar = (ic.l) it.next();
            cVar2.f10865a = qVar;
            cVar2.f10866b = it;
            cVar2.f10868d = 2;
            if (lVar.invoke(cVar2) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) qVar.f5776a;
        if (th == null) {
            return ub.k.f9073a;
        }
        throw th;
    }

    public static final boolean e(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        jc.i.e(bArr, "a");
        jc.i.e(bArr2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final Object f(Task task, ac.c cVar) throws Exception {
        if (!task.isComplete()) {
            rc.k kVar = new rc.k(1, qd.b.r(cVar));
            kVar.s();
            task.addOnCompleteListener(ad.a.f288a, new a5.b(kVar, 3));
            Object objR = kVar.r();
            zb.a aVar = zb.a.f11555a;
            return objR;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static t2.e g(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e;
        t2.e eVar = new t2.e();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i = objectInputStream.readInt(); i > 0; i--) {
                            eVar.f8540a.add(new t2.d(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                        }
                    } catch (IOException e4) {
                        e = e4;
                        e.printStackTrace();
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return eVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e12) {
                objectInputStream = null;
                e = e12;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
            try {
                objectInputStream.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        }
        return eVar;
    }

    public static final void k(long j4, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j4 || j4 - j10 < j11) {
            StringBuilder sbL = da.v.l("size=", " offset=", j4);
            sbL.append(j10);
            sbL.append(" byteCount=");
            sbL.append(j11);
            throw new ArrayIndexOutOfBoundsException(sbL.toString());
        }
    }

    public static int l(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strD = d0.g.d(str);
            if (strD != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && p0.b.a(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerC = d0.h.c(context);
                    iC = d0.h.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iC == 0) {
                        iC = d0.h.a(appOpsManagerC, strD, iMyUid, d0.h.b(context));
                    }
                } else {
                    iC = d0.g.c((AppOpsManager) d0.g.a(context, AppOpsManager.class), strD, packageName);
                }
                if (iC != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static float[] m(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final void n(int i, int i10) {
        if (i <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i10 + ").");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0 A[Catch: NumberFormatException -> 0x00ae, TryCatch #0 {NumberFormatException -> 0x00ae, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:48:0x009a, B:50:0x00a0, B:56:0x00b5, B:57:0x00b8), top: B:71:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5 A[Catch: NumberFormatException -> 0x00ae, TryCatch #0 {NumberFormatException -> 0x00ae, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:48:0x009a, B:50:0x00a0, B:56:0x00b5, B:57:0x00b8), top: B:71:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df A[SYNTHETIC] */
    public static h0.f[] o(String str) {
        String strTrim;
        float[] fArrM;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i10 = 0;
        int i11 = 1;
        while (i11 < str.length()) {
            while (i11 < str.length()) {
                char cCharAt = str.charAt(i11);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i10, i11).trim();
                        if (strTrim.length() <= 0) {
                            if (strTrim.charAt(i) != 'z' || strTrim.charAt(i) == 'Z') {
                                fArrM = new float[i];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i12 = i;
                                    int i13 = 1;
                                    while (i13 < length) {
                                        int i14 = i;
                                        int i15 = i14;
                                        int i16 = i15;
                                        int i17 = i16;
                                        for (int i18 = i13; i18 < strTrim.length(); i18++) {
                                            char cCharAt2 = strTrim.charAt(i18);
                                            if (cCharAt2 == ' ') {
                                                i14 = 0;
                                                i16 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i14 = 0;
                                                        i16 = 1;
                                                        break;
                                                    case '-':
                                                        if (i18 == i13 || i14 != 0) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = 0;
                                                            i16 = 1;
                                                            i17 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i15 == 0) {
                                                            i14 = 0;
                                                            i15 = 1;
                                                        } else {
                                                            i14 = 0;
                                                            i16 = 1;
                                                            i17 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i14 = 0;
                                                        break;
                                                }
                                            } else {
                                                i14 = 1;
                                            }
                                            if (i16 != 0) {
                                                if (i13 < i18) {
                                                    fArr[i12] = Float.parseFloat(strTrim.substring(i13, i18));
                                                    i12++;
                                                }
                                                if (i17 != 0) {
                                                    i13 = i18;
                                                } else {
                                                    i13 = i18 + 1;
                                                }
                                                i = 0;
                                            }
                                        }
                                        if (i13 < i18) {
                                            fArr[i12] = Float.parseFloat(strTrim.substring(i13, i18));
                                            i12++;
                                        }
                                        if (i17 != 0) {
                                            i13 = i18;
                                        } else {
                                            i13 = i18 + 1;
                                        }
                                        i = 0;
                                    }
                                    fArrM = m(fArr, i12);
                                    i = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(da.v.i("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            char cCharAt3 = strTrim.charAt(i);
                            h0.f fVar = new h0.f();
                            fVar.f4550a = cCharAt3;
                            fVar.f4551b = fArrM;
                            arrayList.add(fVar);
                        }
                        i10 = i11;
                        i11++;
                        i = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i11++;
            }
            strTrim = str.substring(i10, i11).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(i) != 'z') {
                    fArrM = new float[i];
                } else {
                    fArrM = new float[i];
                }
                char cCharAt4 = strTrim.charAt(i);
                h0.f fVar2 = new h0.f();
                fVar2.f4550a = cCharAt4;
                fVar2.f4551b = fArrM;
                arrayList.add(fVar2);
            }
            i10 = i11;
            i11++;
            i = 0;
        }
        if (i11 - i10 == 1 && i10 < str.length()) {
            char cCharAt5 = str.charAt(i10);
            h0.f fVar3 = new h0.f();
            fVar3.f4550a = cCharAt5;
            fVar3.f4551b = new float[0];
            arrayList.add(fVar3);
        }
        return (h0.f[]) arrayList.toArray(new h0.f[arrayList.size()]);
    }

    public static h0.f[] p(h0.f[] fVarArr) {
        if (fVarArr == null) {
            return null;
        }
        h0.f[] fVarArr2 = new h0.f[fVarArr.length];
        for (int i = 0; i < fVarArr.length; i++) {
            h0.f fVar = fVarArr[i];
            h0.f fVar2 = new h0.f();
            fVar2.f4550a = fVar.f4550a;
            float[] fArr = fVar.f4551b;
            fVar2.f4551b = m(fArr, fArr.length);
            fVarArr2[i] = fVar2;
        }
        return fVarArr2;
    }

    public static h7.c q(byte[] bArr, Parcelable.Creator creator) {
        com.google.android.gms.common.internal.i0.i(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        h7.c cVar = (h7.c) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return cVar;
    }

    public static void r(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x9.b bVar = (x9.b) obj;
            x9.g gVar = new x9.g(bVar);
            for (x9.q qVar : bVar.f10316b) {
                boolean z4 = bVar.e == 0;
                x9.h hVar = new x9.h(qVar, !z4);
                if (!map.containsKey(hVar)) {
                    map.put(hVar, new HashSet());
                }
                Set set = (Set) map.get(hVar);
                if (!set.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set.add(gVar);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (x9.g gVar2 : (Set) it.next()) {
                for (x9.i iVar : gVar2.f10329a.f10317c) {
                    if (iVar.f10336c == 0) {
                        Set<x9.g> set2 = (Set) map.get(new x9.h(iVar.f10334a, iVar.f10335b == 2));
                        if (set2 != null) {
                            for (x9.g gVar3 : set2) {
                                gVar2.f10330b.add(gVar3);
                                gVar3.f10331c.add(gVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<x9.g> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (x9.g gVar4 : hashSet) {
            if (gVar4.f10331c.isEmpty()) {
                hashSet2.add(gVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            x9.g gVar5 = (x9.g) hashSet2.iterator().next();
            hashSet2.remove(gVar5);
            i++;
            for (x9.g gVar6 : gVar5.f10330b) {
                gVar6.f10331c.remove(gVar5);
                if (gVar6.f10331c.isEmpty()) {
                    hashSet2.add(gVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (x9.g gVar7 : hashSet) {
            if (!gVar7.f10331c.isEmpty() && !gVar7.f10330b.isEmpty()) {
                arrayList2.add(gVar7.f10329a);
            }
        }
        throw new x9.j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final bc.b s(Enum[] enumArr) {
        jc.i.e(enumArr, "entries");
        return new bc.b(enumArr);
    }

    public static float t(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static int v(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(q1.a.j(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(q1.a.j(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int x(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(q1.a.j(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int y(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(q1.a.j(i, "Could not convert ", " to State"));
    }

    public static float z(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.e.c(edgeEffect, f10, f11);
        }
        u0.d.a(edgeEffect, f10, f11);
        return f10;
    }

    public abstract void A(e3.h hVar, e3.h hVar2);

    public abstract void B(e3.h hVar, Thread thread);

    public abstract void C(boolean z4);

    public abstract void D(boolean z4);

    public void E(View view, int i) {
        if (!f3698b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3697a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f3698b = true;
        }
        Field field = f3697a;
        if (field != null) {
            try {
                f3697a.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean h(e3.i iVar, e3.d dVar, e3.d dVar2);

    public abstract boolean i(e3.i iVar, Object obj, Object obj2);

    public abstract boolean j(e3.i iVar, e3.h hVar, e3.h hVar2);

    public abstract InputFilter[] u(InputFilter[] inputFilterArr);

    @Override // q0.f1
    public void b() {
    }

    @Override // q0.f1
    public void a(View view) {
    }
}
