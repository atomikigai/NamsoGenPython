package ea;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f3531c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f3532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f3533b;

    public k(File file) {
        this.f3532a = file;
    }

    public final void a() {
        File file = this.f3532a;
        if (this.f3533b == null) {
            try {
                this.f3533b = new i(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // ea.a
    public final void c() {
        da.h.c(this.f3533b, "There was a problem closing the Crashlytics log file.");
        this.f3533b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // ea.a
    public final String e() {
        j jVar;
        byte[] bArr;
        if (this.f3532a.exists()) {
            a();
            i iVar = this.f3533b;
            if (iVar == null) {
                jVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[iVar.T()];
                try {
                    this.f3533b.g(new c(bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                jVar = new j(bArr2, iArr[0]);
            }
        } else {
            jVar = null;
        }
        if (jVar == null) {
            bArr = null;
        } else {
            int i = jVar.f3529a;
            bArr = new byte[i];
            System.arraycopy((byte[]) jVar.f3530b, 0, bArr, 0, i);
        }
        if (bArr != null) {
            return new String(bArr, f3531c);
        }
        return null;
    }

    @Override // ea.a
    public final void l(String str, long j4) {
        a();
        if (this.f3533b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f3533b.c(String.format(Locale.US, "%d %s%n", Long.valueOf(j4), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f3531c));
            while (!this.f3533b.o() && this.f3533b.T() > 65536) {
                this.f3533b.G();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
