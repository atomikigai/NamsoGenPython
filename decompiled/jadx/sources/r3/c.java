package r3;

import android.os.SystemClock;
import android.text.TextUtils;
import da.v;
import h6.o0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import q3.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f8136c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8134a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8135b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8137d = 5242880;

    public c(o0 o0Var) {
        this.f8136c = o0Var;
    }

    public static String c(String str) {
        int length = str.length() / 2;
        StringBuilder sbB = u.e.b(String.valueOf(str.substring(0, length).hashCode()));
        sbB.append(String.valueOf(str.substring(length).hashCode()));
        return sbB.toString();
    }

    public static int h(gb.d dVar) throws IOException {
        int i = dVar.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static int i(gb.d dVar) {
        return (h(dVar) << 24) | h(dVar) | (h(dVar) << 8) | (h(dVar) << 16);
    }

    public static long j(gb.d dVar) {
        return (((long) h(dVar)) & 255) | ((((long) h(dVar)) & 255) << 8) | ((((long) h(dVar)) & 255) << 16) | ((((long) h(dVar)) & 255) << 24) | ((((long) h(dVar)) & 255) << 32) | ((((long) h(dVar)) & 255) << 40) | ((((long) h(dVar)) & 255) << 48) | ((255 & ((long) h(dVar))) << 56);
    }

    public static String k(gb.d dVar) {
        return new String(l(dVar, j(dVar)), "UTF-8");
    }

    public static byte[] l(gb.d dVar, long j4) throws IOException {
        long j10 = dVar.f4451b - dVar.f4452c;
        if (j4 >= 0 && j4 <= j10) {
            int i = (int) j4;
            if (i == j4) {
                byte[] bArr = new byte[i];
                new DataInputStream(dVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbL = v.l("streamToBytes length=", ", maxLength=", j4);
        sbL.append(j10);
        throw new IOException(sbL.toString());
    }

    public static void m(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void n(BufferedOutputStream bufferedOutputStream, long j4) {
        bufferedOutputStream.write((byte) j4);
        bufferedOutputStream.write((byte) (j4 >>> 8));
        bufferedOutputStream.write((byte) (j4 >>> 16));
        bufferedOutputStream.write((byte) (j4 >>> 24));
        bufferedOutputStream.write((byte) (j4 >>> 32));
        bufferedOutputStream.write((byte) (j4 >>> 40));
        bufferedOutputStream.write((byte) (j4 >>> 48));
        bufferedOutputStream.write((byte) (j4 >>> 56));
    }

    public static void o(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        n(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public final synchronized q3.b a(String str) {
        b bVar = (b) this.f8134a.get(str);
        if (bVar == null) {
            return null;
        }
        File fileB = b(str);
        try {
            gb.d dVar = new gb.d(new BufferedInputStream(new FileInputStream(fileB)), fileB.length());
            try {
                b bVarA = b.a(dVar);
                if (TextUtils.equals(str, bVarA.f8129b)) {
                    q3.b bVarB = bVar.b(l(dVar, dVar.f4451b - dVar.f4452c));
                    dVar.close();
                    return bVarB;
                }
                q.b("%s: key=%s, found=%s", fileB.getAbsolutePath(), str, bVarA.f8129b);
                b bVar2 = (b) this.f8134a.remove(str);
                if (bVar2 != null) {
                    this.f8135b -= bVar2.f8128a;
                }
                dVar.close();
                return null;
            } catch (Throwable th) {
                dVar.close();
                throw th;
            }
        } catch (IOException e) {
            q.b("%s: %s", fileB.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean zDelete = b(str).delete();
                b bVar3 = (b) this.f8134a.remove(str);
                if (bVar3 != null) {
                    this.f8135b -= bVar3.f8128a;
                }
                if (!zDelete) {
                    q.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
                }
                return null;
            }
        }
    }

    public final File b(String str) {
        return new File(this.f8136c.g(), c(str));
    }

    public final synchronized void d() {
        try {
            File fileG = this.f8136c.g();
            if (!fileG.exists()) {
                if (!fileG.mkdirs()) {
                    q.c("Unable to create cache dir %s", fileG.getAbsolutePath());
                }
                return;
            }
            File[] fileArrListFiles = fileG.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    long length = file.length();
                    gb.d dVar = new gb.d(new BufferedInputStream(new FileInputStream(file)), length);
                    try {
                        b bVarA = b.a(dVar);
                        bVarA.f8128a = length;
                        g(bVarA.f8129b, bVarA);
                        dVar.close();
                    } catch (Throwable th) {
                        dVar.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e() {
        long j4 = this.f8135b;
        int i = this.f8137d;
        if (j4 < i) {
            return;
        }
        int i10 = 0;
        if (q.f8026a) {
            q.d("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f8135b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f8134a.entrySet().iterator();
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            if (b(bVar.f8129b).delete()) {
                this.f8135b -= bVar.f8128a;
            } else {
                String str = bVar.f8129b;
                q.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
            }
            it.remove();
            i10++;
            if (this.f8135b < i * 0.9f) {
                break;
            }
        }
        if (q.f8026a) {
            q.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f8135b - j10), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public final synchronized void f(String str, q3.b bVar) {
        long j4 = this.f8135b;
        byte[] bArr = bVar.f7978a;
        long length = j4 + ((long) bArr.length);
        int i = this.f8137d;
        if (length > i && bArr.length > i * 0.9f) {
            return;
        }
        File fileB = b(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileB));
            b bVar2 = new b(str, bVar);
            if (!bVar2.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                q.b("Failed to write header for %s", fileB.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(bVar.f7978a);
            bufferedOutputStream.close();
            bVar2.f8128a = fileB.length();
            g(str, bVar2);
            e();
        } catch (IOException unused) {
            if (!fileB.delete()) {
                q.b("Could not clean up file %s", fileB.getAbsolutePath());
            }
            if (!this.f8136c.g().exists()) {
                q.b("Re-initializing cache after external clearing.", new Object[0]);
                this.f8134a.clear();
                this.f8135b = 0L;
                d();
            }
        }
    }

    public final void g(String str, b bVar) {
        LinkedHashMap linkedHashMap = this.f8134a;
        if (linkedHashMap.containsKey(str)) {
            this.f8135b = (bVar.f8128a - ((b) linkedHashMap.get(str)).f8128a) + this.f8135b;
        } else {
            this.f8135b += bVar.f8128a;
        }
        linkedHashMap.put(str, bVar);
    }
}
