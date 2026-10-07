package v1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.webkit.TracingConfig;
import da.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.i f9129a = new r7.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f9130b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f9131c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f9132d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f9133f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f9134g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f9135j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f9127g * 2) + 7) & (-8)) / 8) + (cVar.e * 2) + d(cVar.f9122a, bArr, cVar.f9123b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f9126f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f9133f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f9122a, bArr, cVar2.f9123b));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.h;
                int length2 = iArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = iArr[i10];
                    u(byteArrayOutputStream, i12 - i11);
                    i10++;
                    i11 = i12;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f9122a, bArr, cVar3.f9123b));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.h;
                int length3 = iArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length3) {
                    int i15 = iArr2[i13];
                    u(byteArrayOutputStream, i15 - i14);
                    i13++;
                    i14 = i15;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : fileArrListFiles) {
            z4 = c(file2) && z4;
        }
        return z4;
    }

    public static String d(String str, byte[] bArr, String str2) {
        byte[] bArr2 = h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f9134g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return q1.a.m(u.e.b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(v.f(i10, "Not enough bytes to read: "));
            }
            i11 += i12;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iM = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i11] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e4) {
                    throw new IllegalStateException(e4.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f9135j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                c[] cVarArrK = k(byteArrayInputStream, bArr2, iM, cVarArr);
                byteArrayInputStream.close();
                return cVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f9132d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream2, iM2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i10, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i11] = (int) m(byteArrayInputStream, 2);
            strArr[i11] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            if (!cVar.f9123b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            cVar.e = i13;
            cVar.h = g(byteArrayInputStream, i13);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i12 = 0; i12 < cVarArr.length; i12++) {
                    if (cVarArr[i12].f9123b.equals(strSubstring)) {
                        cVar = cVarArr[i12];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f9125d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, h)) {
                cVar.e = iM;
                cVar.h = iArrG;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            c[] cVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return cVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i10) throws IOException {
        byte[] bArrF = f(inputStream, i10);
        long j4 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j4 += ((long) (bArrF[i11] & 255)) << (i11 * 8);
        }
        return j4;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i12] = new c(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            c cVar = cVarArr[i13];
            int iAvailable = byteArrayInputStream.available();
            int i14 = cVar.f9126f;
            int i15 = cVar.f9127g;
            TreeMap treeMap = cVar.i;
            int i16 = iAvailable - i14;
            int iM3 = i11;
            while (byteArrayInputStream.available() > i16) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i17 = i11;
                            int i18 = i13;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i11 = i17;
                            i13 = i18;
                        }
                    }
                    iM4--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i19 = i11;
            int i20 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.h = g(byteArrayInputStream, cVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i15; i21++) {
                int i22 = bitSetValueOf.get(i21) ? 2 : i19;
                if (bitSetValueOf.get(i21 + i15)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | numValueOf.intValue()));
                }
            }
            i13 = i20 + 1;
            i11 = i19;
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f9132d;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(cVarArr, bArr3);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f9134g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.i.size() * 4;
                    String strD = d(cVar.f9122a, bArr4, cVar.f9123b);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, cVar.h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, cVar.f9124c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = cVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i11 : cVar.h) {
                        u(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f9133f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(cVarArr, bArr5);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String str = cVar2.f9122a;
                TreeMap treeMap = cVar2.i;
                String strD2 = d(str, bArr6, cVar2.f9123b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar2.h.length);
                t(byteArrayOutputStream, cVar2.f9124c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : cVar2.h) {
                    u(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, cVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (c cVar3 : cVarArr) {
                t(byteArrayOutputStream2, cVar3.f9124c, 4);
                t(byteArrayOutputStream2, cVar3.f9125d, 4);
                t(byteArrayOutputStream2, cVar3.f9127g, 4);
                String strD3 = d(cVar3.f9122a, bArr2, cVar3.f9123b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i15];
                    u(byteArrayOutputStream3, i15);
                    u(byteArrayOutputStream3, cVar4.e);
                    i16 = i16 + 4 + (cVar4.e * i13);
                    int[] iArr = cVar4.h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        u(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            m mVar2 = new m(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i21];
                    Iterator it3 = cVar5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream5, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            u(byteArrayOutputStream4, i21);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream4, length4, 4);
                            u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i22 = i23 + length4;
                            i21++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i22 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i22 + ", does not match actual size " + byteArray5.length);
            }
            m mVar3 = new m(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList2.add(mVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i24);
                int i25 = mVar4.f9144a;
                byte[] bArr7 = mVar4.f9145b;
                if (i25 == 1) {
                    j4 = 0;
                } else if (i25 == 2) {
                    j4 = 1;
                } else if (i25 == 3) {
                    j4 = 2;
                } else if (i25 == 4) {
                    j4 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                t(byteArrayOutputStream, j4, 4);
                t(byteArrayOutputStream, size2, 4);
                if (mVar4.f9146c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.e);
        t(byteArrayOutputStream, cVar.f9126f, 4);
        t(byteArrayOutputStream, cVar.f9124c, 4);
        t(byteArrayOutputStream, cVar.f9127g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        byte[] bArr = new byte[(((cVar.f9127g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i10 = iIntValue / 8;
                bArr[i10] = (byte) (bArr[i10] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i11 = iIntValue + cVar.f9127g;
                int i12 = i11 / 8;
                bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : cVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i10);
                u(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181 A[Catch: all -> 0x017e, TRY_ENTER, TryCatch #11 {all -> 0x017e, blocks: (B:87:0x015d, B:89:0x0169, B:100:0x0181, B:101:0x0186), top: B:229:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0192 A[Catch: IllegalStateException -> 0x0178, IOException -> 0x017a, FileNotFoundException -> 0x017c, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x017c, IOException -> 0x017a, IllegalStateException -> 0x0178, blocks: (B:85:0x0155, B:90:0x0173, B:108:0x0192, B:106:0x018f, B:105:0x018c), top: B:248:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d2 A[Catch: all -> 0x01e0, TRY_LEAVE, TryCatch #0 {all -> 0x01e0, blocks: (B:123:0x01c6, B:125:0x01d2, B:134:0x01e3), top: B:215:0x01c6, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e3 A[Catch: all -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01e0, blocks: (B:123:0x01c6, B:125:0x01d2, B:134:0x01e3), top: B:215:0x01c6, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0200  */
    /* JADX WARN: Code duplicated, block: B:149:0x020c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0210  */
    /* JADX WARN: Code duplicated, block: B:158:0x022c A[Catch: all -> 0x024e, TRY_LEAVE, TryCatch #20 {all -> 0x024e, blocks: (B:155:0x0224, B:156:0x0226, B:158:0x022c), top: B:231:0x0224 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x027b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0285  */
    /* JADX WARN: Code duplicated, block: B:209:0x028f  */
    /* JADX WARN: Code duplicated, block: B:229:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0169 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #11 {all -> 0x017e, blocks: (B:87:0x015d, B:89:0x0169, B:100:0x0181, B:101:0x0186), top: B:229:0x015d }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void s(Context context, Executor executor, e eVar, boolean z4) {
        FileInputStream fileInputStreamA;
        char c10;
        c[] cVarArrL;
        e eVar2;
        c[] cVarArr;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i10;
        boolean z11;
        ByteArrayOutputStream byteArrayOutputStream;
        int i11;
        b bVar;
        FileInputStream fileInputStreamA2;
        boolean z12;
        boolean z13;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z4) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j4 = dataInputStream.readLong();
                            dataInputStream.close();
                            z13 = j4 == packageInfo.lastUpdateTime;
                            if (z13) {
                                eVar.f(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z13 = false;
                    }
                } else {
                    z13 = false;
                }
                if (z13) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    l.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i12 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, eVar, name, file2);
            byte[] bArr4 = (byte[]) bVar2.e;
            if (bArr4 != null) {
                if (file2.canWrite()) {
                    bVar2.f9118c = true;
                    try {
                        fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e4) {
                        eVar.f(6, e4);
                        fileInputStreamA = null;
                    } catch (IOException e10) {
                        eVar.f(7, e10);
                        fileInputStreamA = null;
                    }
                    byte[] bArr5 = f9130b;
                    c10 = '\b';
                    try {
                        if (fileInputStreamA != null) {
                            try {
                                if (!Arrays.equals(bArr5, f(fileInputStreamA, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                cVarArrL = l(fileInputStreamA, f(fileInputStreamA, 4), bVar2.f9117b);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e11) {
                                    eVar.f(7, e11);
                                }
                                bVar2.h = cVarArrL;
                            } catch (IOException e12) {
                                eVar.f(7, e12);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e13) {
                                    eVar.f(7, e13);
                                }
                                cVarArrL = null;
                            } catch (IllegalStateException e14) {
                                eVar.f(8, e14);
                                fileInputStreamA.close();
                                cVarArrL = null;
                            }
                        }
                        c[] cVarArr2 = (c[]) bVar2.h;
                        if (cVarArr2 != null && (i11 = Build.VERSION.SDK_INT) <= 33) {
                            if (i11 != 24 && i11 != 25) {
                                switch (i11) {
                                    case 31:
                                    case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                                    case 33:
                                        fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                        if (fileInputStreamA2 == null) {
                                            if (fileInputStreamA2 != null) {
                                                fileInputStreamA2.close();
                                            }
                                            bVar = null;
                                        } else {
                                            if (Arrays.equals(f9131c, f(fileInputStreamA2, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            bVar2.h = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr4, cVarArr2);
                                            fileInputStreamA2.close();
                                            bVar = bVar2;
                                        }
                                        if (bVar != null) {
                                            bVar2 = bVar;
                                            break;
                                        }
                                    default:
                                        eVar2 = (e) bVar2.f9119d;
                                        cVarArr = (c[]) bVar2.h;
                                        bArr = (byte[]) bVar2.e;
                                        if (cVarArr != null && bArr != null) {
                                            if (bVar2.f9118c) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                try {
                                                    byteArrayOutputStream.write(bArr5);
                                                    byteArrayOutputStream.write(bArr);
                                                    if (o(byteArrayOutputStream, bArr, cVarArr)) {
                                                        bVar2.f9120f = byteArrayOutputStream.toByteArray();
                                                        byteArrayOutputStream.close();
                                                        bVar2.h = null;
                                                    } else {
                                                        eVar2.f(5, null);
                                                        bVar2.h = null;
                                                        byteArrayOutputStream.close();
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        byteArrayOutputStream.close();
                                                        throw th4;
                                                    } catch (Throwable th5) {
                                                        th4.addSuppressed(th5);
                                                        throw th4;
                                                    }
                                                }
                                            } catch (IOException e15) {
                                                eVar2.f(7, e15);
                                            } catch (IllegalStateException e16) {
                                                eVar2.f(8, e16);
                                            }
                                        }
                                        bArr2 = (byte[]) bVar2.f9120f;
                                        if (bArr2 != null) {
                                            z10 = false;
                                            c10 = 1;
                                        } else {
                                            try {
                                                if (bVar2.f9118c) {
                                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                }
                                                try {
                                                    try {
                                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                        try {
                                                            fileOutputStream = new FileOutputStream((File) bVar2.f9121g);
                                                            try {
                                                                try {
                                                                    bArr3 = new byte[512];
                                                                    while (true) {
                                                                        i10 = byteArrayInputStream.read(bArr3);
                                                                        if (i10 > 0) {
                                                                            fileOutputStream.write(bArr3, 0, i10);
                                                                        } else {
                                                                            c10 = 1;
                                                                            try {
                                                                                bVar2.b(1, null);
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                bVar2.f9120f = null;
                                                                                bVar2.h = null;
                                                                                z10 = true;
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                            }
                                                                        }
                                                                        th = th;
                                                                        try {
                                                                            fileOutputStream.close();
                                                                            throw th;
                                                                        } catch (Throwable th7) {
                                                                            th.addSuppressed(th7);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    Throwable th9 = th;
                                                                    try {
                                                                        byteArrayInputStream.close();
                                                                        throw th9;
                                                                    } catch (Throwable th10) {
                                                                        th9.addSuppressed(th10);
                                                                        throw th9;
                                                                    }
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                        }
                                                    } catch (FileNotFoundException e17) {
                                                        e = e17;
                                                        bVar2.b(6, e);
                                                        bVar2.f9120f = null;
                                                        bVar2.h = null;
                                                        z10 = false;
                                                    } catch (IOException e18) {
                                                        e = e18;
                                                        bVar2.b(7, e);
                                                        bVar2.f9120f = null;
                                                        bVar2.h = null;
                                                        z10 = false;
                                                    }
                                                } catch (FileNotFoundException e19) {
                                                    e = e19;
                                                    c10 = 1;
                                                    bVar2.b(6, e);
                                                    bVar2.f9120f = null;
                                                    bVar2.h = null;
                                                    z10 = false;
                                                } catch (IOException e20) {
                                                    e = e20;
                                                    c10 = 1;
                                                    bVar2.b(7, e);
                                                    bVar2.f9120f = null;
                                                    bVar2.h = null;
                                                    z10 = false;
                                                }
                                            } catch (Throwable th13) {
                                                bVar2.f9120f = null;
                                                bVar2.h = null;
                                                throw th13;
                                            }
                                        }
                                        if (z10) {
                                            e(packageInfo, filesDir);
                                        }
                                        z11 = z10;
                                        break;
                                }
                            } else {
                                try {
                                    fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA2 == null) {
                                        try {
                                            if (Arrays.equals(f9131c, f(fileInputStreamA2, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            bVar2.h = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr4, cVarArr2);
                                            fileInputStreamA2.close();
                                            bVar = bVar2;
                                        } catch (Throwable th14) {
                                            try {
                                                fileInputStreamA2.close();
                                                throw th14;
                                            } catch (Throwable th15) {
                                                th14.addSuppressed(th15);
                                                throw th14;
                                            }
                                        }
                                    } else {
                                        if (fileInputStreamA2 != null) {
                                            fileInputStreamA2.close();
                                        }
                                        bVar = null;
                                    }
                                } catch (FileNotFoundException e21) {
                                    eVar.f(9, e21);
                                } catch (IOException e22) {
                                    eVar.f(7, e22);
                                } catch (IllegalStateException e23) {
                                    bVar2.h = null;
                                    eVar.f(8, e23);
                                }
                                if (bVar != null) {
                                    bVar2 = bVar;
                                }
                            }
                        }
                        eVar2 = (e) bVar2.f9119d;
                        cVarArr = (c[]) bVar2.h;
                        bArr = (byte[]) bVar2.e;
                        if (cVarArr != null) {
                            if (bVar2.f9118c) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr5);
                            byteArrayOutputStream.write(bArr);
                            if (o(byteArrayOutputStream, bArr, cVarArr)) {
                                eVar2.f(5, null);
                                bVar2.h = null;
                                byteArrayOutputStream.close();
                            } else {
                                bVar2.f9120f = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                bVar2.h = null;
                            }
                        }
                        bArr2 = (byte[]) bVar2.f9120f;
                        if (bArr2 != null) {
                            if (bVar2.f9118c) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                            fileOutputStream = new FileOutputStream((File) bVar2.f9121g);
                            bArr3 = new byte[512];
                            while (true) {
                                i10 = byteArrayInputStream.read(bArr3);
                                if (i10 > 0) {
                                    fileOutputStream.write(bArr3, 0, i10);
                                } else {
                                    c10 = 1;
                                    bVar2.b(1, null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    bVar2.f9120f = null;
                                    bVar2.h = null;
                                    z10 = true;
                                }
                                th = th;
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                        z10 = false;
                        c10 = 1;
                        if (z10) {
                            e(packageInfo, filesDir);
                        }
                        z11 = z10;
                    } catch (Throwable th16) {
                        try {
                            fileInputStreamA.close();
                            throw th16;
                        } catch (IOException e24) {
                            eVar.f(7, e24);
                            throw th16;
                        }
                    }
                } else {
                    bVar2.b(4, null);
                }
                if (z11 || !z4) {
                    z12 = 0;
                } else {
                    z12 = c10;
                }
                l.c(context, z12);
            }
            bVar2.b(3, Integer.valueOf(i12));
            z11 = false;
            c10 = 1;
            if (z11) {
                z12 = 0;
            } else {
                z12 = 0;
            }
            l.c(context, z12);
        } catch (PackageManager.NameNotFoundException e25) {
            eVar.f(7, e25);
            l.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j4, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j4 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        t(byteArrayOutputStream, i10, 2);
    }
}
