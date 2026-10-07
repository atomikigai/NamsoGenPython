package s3;

import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.manager.q;
import d6.m;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f8371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f8372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f8373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f8374d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8375f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public BufferedWriter f8378t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8380v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8377s = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f8379u = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f8381w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ThreadPoolExecutor f8382x = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f8383y = new m(this, 5);
    public final int e = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8376r = 1;

    public c(File file, long j4) {
        this.f8371a = file;
        this.f8372b = new File(file, "journal");
        this.f8373c = new File(file, "journal.tmp");
        this.f8374d = new File(file, "journal.bkp");
        this.f8375f = j4;
    }

    public static void B(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c H(File file, long j4) throws IOException {
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                W(file2, file3, false);
            }
        }
        c cVar = new c(file, j4);
        if (cVar.f8372b.exists()) {
            try {
                cVar.T();
                cVar.S();
                return cVar;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                cVar.close();
                e.a(cVar.f8371a);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j4);
        cVar2.V();
        return cVar2;
    }

    public static void W(File file, File file2, boolean z4) throws IOException {
        if (z4) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void c(c cVar, q qVar, boolean z4) {
        synchronized (cVar) {
            b bVar = (b) qVar.f1933b;
            if (bVar.f8369f != qVar) {
                throw new IllegalStateException();
            }
            if (z4 && !bVar.e) {
                for (int i = 0; i < cVar.f8376r; i++) {
                    if (!((boolean[]) qVar.f1934c)[i]) {
                        qVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!bVar.f8368d[i].exists()) {
                        qVar.a();
                        return;
                    }
                }
            }
            for (int i10 = 0; i10 < cVar.f8376r; i10++) {
                File file = bVar.f8368d[i10];
                if (!z4) {
                    g(file);
                } else if (file.exists()) {
                    File file2 = bVar.f8367c[i10];
                    file.renameTo(file2);
                    long j4 = bVar.f8366b[i10];
                    long length = file2.length();
                    bVar.f8366b[i10] = length;
                    cVar.f8377s = (cVar.f8377s - j4) + length;
                }
            }
            cVar.f8380v++;
            bVar.f8369f = null;
            if (bVar.e || z4) {
                bVar.e = true;
                cVar.f8378t.append((CharSequence) "CLEAN");
                cVar.f8378t.append(' ');
                cVar.f8378t.append((CharSequence) bVar.f8365a);
                cVar.f8378t.append((CharSequence) bVar.a());
                cVar.f8378t.append('\n');
                if (z4) {
                    cVar.f8381w++;
                }
            } else {
                cVar.f8379u.remove(bVar.f8365a);
                cVar.f8378t.append((CharSequence) "REMOVE");
                cVar.f8378t.append(' ');
                cVar.f8378t.append((CharSequence) bVar.f8365a);
                cVar.f8378t.append('\n');
            }
            B(cVar.f8378t);
            if (cVar.f8377s > cVar.f8375f || cVar.G()) {
                cVar.f8382x.submit(cVar.f8383y);
            }
        }
    }

    public static void d(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final synchronized a4.b E(String str) {
        if (this.f8378t == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.f8379u.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.e) {
            return null;
        }
        for (File file : bVar.f8367c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f8380v++;
        this.f8378t.append((CharSequence) "READ");
        this.f8378t.append(' ');
        this.f8378t.append((CharSequence) str);
        this.f8378t.append('\n');
        if (G()) {
            this.f8382x.submit(this.f8383y);
        }
        return new a4.b(bVar.f8367c, 28);
    }

    public final boolean G() {
        int i = this.f8380v;
        return i >= 2000 && i >= this.f8379u.size();
    }

    public final void S() throws IOException {
        g(this.f8373c);
        Iterator it = this.f8379u.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            q qVar = bVar.f8369f;
            int i = this.f8376r;
            int i10 = 0;
            if (qVar == null) {
                while (i10 < i) {
                    this.f8377s += bVar.f8366b[i10];
                    i10++;
                }
            } else {
                bVar.f8369f = null;
                while (i10 < i) {
                    g(bVar.f8367c[i10]);
                    g(bVar.f8368d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void T() {
        File file = this.f8372b;
        d dVar = new d(new FileInputStream(file), e.f8388a);
        try {
            String strC = dVar.c();
            String strC2 = dVar.c();
            String strC3 = dVar.c();
            String strC4 = dVar.c();
            String strC5 = dVar.c();
            if (!"libcore.io.DiskLruCache".equals(strC) || !"1".equals(strC2) || !Integer.toString(this.e).equals(strC3) || !Integer.toString(this.f8376r).equals(strC4) || !"".equals(strC5)) {
                throw new IOException("unexpected journal header: [" + strC + ", " + strC2 + ", " + strC4 + ", " + strC5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    U(dVar.c());
                    i++;
                } catch (EOFException unused) {
                    this.f8380v = i - this.f8379u.size();
                    if (dVar.e == -1) {
                        V();
                    } else {
                        this.f8378t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e.f8388a));
                    }
                    try {
                        dVar.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void U(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f8379u;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        b bVar = (b) linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f8369f = new q(this, bVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        bVar.e = true;
        bVar.f8369f = null;
        if (strArrSplit.length != bVar.f8370g.f8376r) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                bVar.f8366b[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void V() {
        try {
            BufferedWriter bufferedWriter = this.f8378t;
            if (bufferedWriter != null) {
                d(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8373c), e.f8388a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f8376r));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.f8379u.values()) {
                    if (bVar.f8369f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f8365a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f8365a + bVar.a() + '\n');
                    }
                }
                d(bufferedWriter2);
                if (this.f8372b.exists()) {
                    W(this.f8372b, this.f8374d, true);
                }
                W(this.f8373c, this.f8372b, false);
                this.f8374d.delete();
                this.f8378t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8372b, true), e.f8388a));
            } catch (Throwable th) {
                d(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void X() {
        while (this.f8377s > this.f8375f) {
            String str = (String) ((Map.Entry) this.f8379u.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f8378t == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.f8379u.get(str);
                    if (bVar != null && bVar.f8369f == null) {
                        for (int i = 0; i < this.f8376r; i++) {
                            File file = bVar.f8367c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j4 = this.f8377s;
                            long[] jArr = bVar.f8366b;
                            this.f8377s = j4 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f8380v++;
                        this.f8378t.append((CharSequence) "REMOVE");
                        this.f8378t.append(' ');
                        this.f8378t.append((CharSequence) str);
                        this.f8378t.append('\n');
                        this.f8379u.remove(str);
                        if (G()) {
                            this.f8382x.submit(this.f8383y);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f8378t == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f8379u.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                q qVar = ((b) obj).f8369f;
                if (qVar != null) {
                    qVar.a();
                }
            }
            X();
            d(this.f8378t);
            this.f8378t = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final q o(String str) {
        synchronized (this) {
            try {
                if (this.f8378t == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.f8379u.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f8379u.put(str, bVar);
                } else if (bVar.f8369f != null) {
                    return null;
                }
                q qVar = new q(this, bVar);
                bVar.f8369f = qVar;
                this.f8378t.append((CharSequence) "DIRTY");
                this.f8378t.append(' ');
                this.f8378t.append((CharSequence) str);
                this.f8378t.append('\n');
                B(this.f8378t);
                return qVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
