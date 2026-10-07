package r7;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import w3.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class j implements e, u5.a, v1.e, q4.a, x3.a, y3.a, Continuation {
    @Override // x3.a
    public Bitmap a(int i, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i10, config);
    }

    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // u5.a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // v1.e
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // v1.e
    public void f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // q4.a
    public Object g() {
        return new w();
    }

    @Override // x3.a
    public Bitmap h(int i, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // y3.a
    public File i(u3.f fVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // r7.e
    public d k(Context context, String str, c cVar) {
        d dVar = new d();
        dVar.f8196a = cVar.g(context, str);
        int i = 1;
        int iC = cVar.c(context, str, true);
        dVar.f8197b = iC;
        int i10 = dVar.f8196a;
        if (i10 == 0) {
            i10 = 0;
            if (iC == 0) {
                i = 0;
            } else if (i10 >= iC) {
                i = -1;
            }
        } else if (i10 >= iC) {
            i = -1;
        }
        dVar.f8198c = i;
        return dVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override // x3.a
    public void l() {
    }

    @Override // x3.a
    public void j(int i) {
    }

    @Override // y3.a
    public void b(u3.f fVar, q5.d dVar) {
    }
}
