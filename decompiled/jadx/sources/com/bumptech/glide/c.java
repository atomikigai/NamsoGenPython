package com.bumptech.glide;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import b9.u;
import bd.b0;
import bd.t;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import da.v;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import pc.o;
import q3.q;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static bb.b B(String str) throws ProtocolException {
        int i;
        String strSubstring;
        jc.i.e(str, "statusLine");
        boolean zE0 = o.e0(str, "HTTP/1.", false);
        t tVar = t.HTTP_1_0;
        if (zE0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                tVar = t.HTTP_1_1;
            }
        } else {
            if (!o.e0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i10 = i + 3;
        if (str.length() < i10) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i, i10);
            jc.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i11 = Integer.parseInt(strSubstring2);
            if (str.length() <= i10) {
                strSubstring = "";
            } else {
                if (str.charAt(i10) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
                jc.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new bb.b(tVar, i11, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static void C(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    public static e2.h D(g2.a aVar, String str) {
        long j4;
        Map map;
        wb.i iVar;
        jc.i.e(aVar, "connection");
        g2.c cVarR = aVar.R("PRAGMA table_info(`" + str + "`)");
        try {
            long j10 = 0;
            if (cVarR.O()) {
                int i = r7.g.i(cVarR, "name");
                int i10 = r7.g.i(cVarR, "type");
                int i11 = r7.g.i(cVarR, "notnull");
                int i12 = r7.g.i(cVarR, "pk");
                int i13 = r7.g.i(cVarR, "dflt_value");
                wb.f fVar = new wb.f();
                while (true) {
                    String strF = cVarR.F(i);
                    j4 = j10;
                    fVar.put(strF, new e2.e((int) cVarR.getLong(i12), strF, cVarR.F(i10), cVarR.isNull(i13) ? null : cVarR.F(i13), cVarR.getLong(i11) != j10, 2));
                    if (!cVarR.O()) {
                        break;
                    }
                    j10 = j4;
                }
                fVar.b();
                fVar.f9908x = true;
                if (fVar.f9904t > 0) {
                    map = fVar;
                } else {
                    map = wb.f.f9896y;
                    jc.i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
                }
                a.a.b(cVarR, null);
            } else {
                map = r.f9298a;
                a.a.b(cVarR, null);
                j4 = 0;
            }
            g2.c cVarR2 = aVar.R("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int i14 = r7.g.i(cVarR2, "id");
                int i15 = r7.g.i(cVarR2, "seq");
                int i16 = r7.g.i(cVarR2, "table");
                int i17 = r7.g.i(cVarR2, "on_delete");
                int i18 = r7.g.i(cVarR2, "on_update");
                List listJ = a.a.j(cVarR2);
                cVarR2.reset();
                wb.i iVar2 = new wb.i();
                while (cVarR2.O()) {
                    if (cVarR2.getLong(i15) == j4) {
                        int i19 = (int) cVarR2.getLong(i14);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i20 = i14;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listJ) {
                            int i21 = i15;
                            List list = listJ;
                            if (((e2.d) obj).f3225a == i19) {
                                arrayList3.add(obj);
                            }
                            i15 = i21;
                            listJ = list;
                        }
                        int i22 = i15;
                        List list2 = listJ;
                        int size = arrayList3.size();
                        int i23 = 0;
                        while (i23 < size) {
                            Object obj2 = arrayList3.get(i23);
                            i23++;
                            e2.d dVar = (e2.d) obj2;
                            arrayList.add(dVar.f3227c);
                            arrayList2.add(dVar.f3228d);
                            arrayList3 = arrayList3;
                        }
                        iVar2.add(new e2.f(cVarR2.F(i16), cVarR2.F(i17), cVarR2.F(i18), arrayList, arrayList2));
                        i14 = i20;
                        i15 = i22;
                        listJ = list2;
                    }
                }
                wb.i iVarB = n9.b.b(iVar2);
                a.a.b(cVarR2, null);
                g2.c cVarR3 = aVar.R("PRAGMA index_list(`" + str + "`)");
                try {
                    int i24 = r7.g.i(cVarR3, "name");
                    int i25 = r7.g.i(cVarR3, "origin");
                    int i26 = r7.g.i(cVarR3, "unique");
                    if (i24 == -1 || i25 == -1 || i26 == -1) {
                        a.a.b(cVarR3, null);
                        iVar = null;
                    } else {
                        wb.i iVar3 = new wb.i();
                        while (cVarR3.O()) {
                            if ("c".equals(cVarR3.F(i25))) {
                                e2.g gVarK = a.a.k(aVar, cVarR3.F(i24), cVarR3.getLong(i26) == 1);
                                if (gVarK == null) {
                                    a.a.b(cVarR3, null);
                                    iVar = null;
                                } else {
                                    iVar3.add(gVarK);
                                }
                            }
                        }
                        wb.i iVarB2 = n9.b.b(iVar3);
                        a.a.b(cVarR3, null);
                        iVar = iVarB2;
                    }
                    return new e2.h(str, map, iVarB, iVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        a.a.b(cVarR3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    a.a.b(cVarR2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                a.a.b(cVarR, th5);
                throw th6;
            }
        }
    }

    public static boolean E(int i, Parcel parcel) {
        U(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean F(int i, Parcel parcel) {
        int iO = O(i, parcel);
        if (iO == 0) {
            return null;
        }
        T(parcel, iO, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double G(int i, Parcel parcel) {
        int iO = O(i, parcel);
        if (iO == 0) {
            return null;
        }
        T(parcel, iO, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float H(int i, Parcel parcel) {
        U(parcel, i, 4);
        return parcel.readFloat();
    }

    public static IBinder I(int i, Parcel parcel) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iO);
        return strongBinder;
    }

    public static int J(int i, Parcel parcel) {
        U(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer K(int i, Parcel parcel) {
        int iO = O(i, parcel);
        if (iO == 0) {
            return null;
        }
        T(parcel, iO, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
      0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String L(Context context) {
        String attributeValue = "";
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | XmlPullParserException unused2) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                } else {
                    Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(attributeValue));
                }
                return attributeValue;
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    public static long M(int i, Parcel parcel) {
        U(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long N(int i, Parcel parcel) {
        int iO = O(i, parcel);
        if (iO == 0) {
            return null;
        }
        T(parcel, iO, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int O(int i, Parcel parcel) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final void P(Object[] objArr, int i, int i10) {
        jc.i.e(objArr, "<this>");
        while (i < i10) {
            objArr[i] = null;
            i++;
        }
    }

    public static void Q(Context context, s4.c cVar, TextView textView) {
        aa.c.H(context, cVar, -1, (TextUtils.isEmpty(cVar.f8398f) || TextUtils.isEmpty(cVar.f8399r)) ? -1 : R.string.fui_tos_and_pp_footer, textView);
    }

    public static void R(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + O(i, parcel));
    }

    public static int S(Parcel parcel) {
        int i = parcel.readInt();
        int iO = O(i, parcel);
        char c10 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new h7.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i10 = iO + iDataPosition;
        if (i10 < iDataPosition || i10 > parcel.dataSize()) {
            throw new h7.b(q1.a.i(iDataPosition, i10, "Size read is invalid start=", " end="), parcel);
        }
        return i10;
    }

    public static void T(Parcel parcel, int i, int i10) {
        if (i == i10) {
            return;
        }
        throw new h7.b(q1.a.m(u3.b.d(i10, i, "Expected size ", " got ", " (0x"), Integer.toHexString(i), ")"), parcel);
    }

    public static void U(Parcel parcel, int i, int i10) {
        int iO = O(i, parcel);
        if (iO == i10) {
            return;
        }
        throw new h7.b(q1.a.m(u3.b.d(i10, iO, "Expected size ", " got ", " (0x"), Integer.toHexString(iO), ")"), parcel);
    }

    public static final String a(Object[] objArr, int i, int i10, vb.d dVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i + i11];
            if (obj == dVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        jc.i.d(string, "toString(...)");
        return string;
    }

    public static void b(StringBuilder sb2, Object obj, ic.l lVar) {
        if (lVar != null) {
            sb2.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static int c(int i, int i10) {
        return h0.a.d(i, (Color.alpha(i) * i10) / 255);
    }

    public static BigDecimal d(int i, Parcel parcel) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i10 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iO);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i10);
    }

    public static Bundle e(int i, Parcel parcel) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iO);
        return bundle;
    }

    public static byte[] f(int i, Parcel parcel) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iO);
        return bArrCreateByteArray;
    }

    public static int[] g(int i, Parcel parcel) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iO);
        return iArrCreateIntArray;
    }

    public static Parcelable h(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iO);
        return parcelable;
    }

    public static String i(int i, Parcel parcel) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iO);
        return string;
    }

    public static String[] j(int i, Parcel parcel) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iO);
        return strArrCreateStringArray;
    }

    public static ArrayList k(int i, Parcel parcel) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iO);
        return arrayListCreateStringArrayList;
    }

    public static Object[] l(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iO);
        return objArrCreateTypedArray;
    }

    public static ArrayList m(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iO);
        return arrayListCreateTypedArrayList;
    }

    public static void n(int i, Parcel parcel) {
        if (parcel.dataPosition() != i) {
            throw new h7.b(v.f(i, "Overread allowed size end="), parcel);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static b0 o(String str) {
        jc.i.e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return b0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return b0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return b0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return b0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return b0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static int p(Context context, int i, int i10) {
        Integer numValueOf;
        TypedValue typedValueL = a.a.l(context, i);
        if (typedValueL != null) {
            int i11 = typedValueL.resourceId;
            numValueOf = Integer.valueOf(i11 != 0 ? e0.k.getColor(context, i11) : typedValueL.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i10;
    }

    public static int q(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueN = a.a.n(view.getContext(), view.getClass().getCanonicalName(), i);
        int i10 = typedValueN.resourceId;
        return i10 != 0 ? e0.k.getColor(context, i10) : typedValueN.data;
    }

    public static v9.e s(String str, String str2) {
        if (v9.e.i(str2)) {
            return new v9.e(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }

    public static q3.h t(q3.k kVar, List list) {
        q3.b bVar = kVar.f8016x;
        if (bVar == null) {
            return new q3.h(304, null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((q3.f) it.next()).f7991a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = bVar.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (q3.f fVar : bVar.h) {
                    if (!treeSet.contains(fVar.f7991a)) {
                        arrayList.add(fVar);
                    }
                }
            }
        } else if (!bVar.f7983g.isEmpty()) {
            for (Map.Entry entry : bVar.f7983g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new q3.f((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new q3.h(304, bVar.f7978a, true, arrayList);
    }

    public static Task u(Intent intent) {
        d7.c cVar;
        GoogleSignInAccount googleSignInAccount;
        j7.a aVar = e7.h.f3486a;
        Status status = Status.f2042r;
        if (intent == null) {
            cVar = new d7.c(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                cVar = new d7.c(null, status);
            } else {
                cVar = new d7.c(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = cVar.f3007a;
        return (!status3.g() || (googleSignInAccount = cVar.f3008b) == null) ? Tasks.forException(i0.n(status3)) : Tasks.forResult(googleSignInAccount);
    }

    public static byte[] v(InputStream inputStream, int i, r3.a aVar) throws Throwable {
        byte[] bArrA;
        r3.f fVar = new r3.f(aVar, i);
        try {
            bArrA = aVar.a(1024);
            while (true) {
                try {
                    int i10 = inputStream.read(bArrA);
                    if (i10 == -1) {
                        break;
                    }
                    fVar.write(bArrA, 0, i10);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        q.d("Error occurred when closing InputStream", new Object[0]);
                    }
                    aVar.b(bArrA);
                    fVar.close();
                    throw th;
                }
            }
            byte[] byteArray = fVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                q.d("Error occurred when closing InputStream", new Object[0]);
            }
            aVar.b(bArrA);
            fVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }

    public static boolean w(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = h0.a.f4544a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) iRed) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iGreen) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) iBlue) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static int x(float f10, int i, int i10) {
        return h0.a.b(h0.a.d(i10, Math.round(Color.alpha(i10) * f10)), i);
    }

    public static String y(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }

    public abstract void A(Typeface typeface, boolean z4);

    public abstract void r(u uVar, float f10, float f11);

    public abstract void z(int i);
}
