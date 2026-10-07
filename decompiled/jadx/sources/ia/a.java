package ia;

import android.util.Log;
import da.i;
import da.j;
import da.l;
import da.v;
import fa.h0;
import ga.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final Charset e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f5239f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f5240g = new c();
    public static final j h = new j(2);
    public static final i i = new i(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5241a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3.j f5243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f5244d;

    public a(b bVar, c3.j jVar, l lVar) {
        this.f5242b = bVar;
        this.f5243c = jVar;
        this.f5244d = lVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f5242b;
        arrayList.addAll(b.e(bVar.e.listFiles()));
        arrayList.addAll(b.e(bVar.f5249f.listFiles()));
        j jVar = h;
        Collections.sort(arrayList, jVar);
        List listE = b.e(bVar.f5248d.listFiles());
        Collections.sort(listE, jVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.e(this.f5242b.f5247c.list())).descendingSet();
    }

    public final void d(h0 h0Var, String str, boolean z4) {
        b bVar = this.f5242b;
        int i10 = this.f5243c.h().f6129a.f8551a;
        f5240g.getClass();
        try {
            f(bVar.b(str, v.i("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f5241a.getAndIncrement())), z4 ? "_" : "")), c.f4427a.f(h0Var));
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e4);
        }
        i iVar = new i(3);
        bVar.getClass();
        File file = new File(bVar.f5247c, str);
        file.mkdirs();
        List<File> listE = b.e(file.listFiles(iVar));
        Collections.sort(listE, new j(3));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= i10) {
                return;
            }
            b.d(file2);
            size--;
        }
    }
}
