package b4;

import a4.w;
import a4.x;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.FileNotFoundException;
import u3.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f1384v = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f1386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f1387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f1388d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1389f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f1390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f1391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f1392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile e f1393u;

    public c(Context context, x xVar, x xVar2, Uri uri, int i, int i10, i iVar, Class cls) {
        this.f1385a = context.getApplicationContext();
        this.f1386b = xVar;
        this.f1387c = xVar2;
        this.f1388d = uri;
        this.e = i;
        this.f1389f = i10;
        this.f1390r = iVar;
        this.f1391s = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f1391s;
    }

    public final e b() throws Throwable {
        w wVarB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f1385a;
        i iVar = this.f1390r;
        int i = this.f1389f;
        int i10 = this.e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f1388d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f1384v, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            wVarB = this.f1386b.b(file, i10, i, iVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f1388d;
            boolean zI = a.a.i(requireOriginal);
            x xVar = this.f1387c;
            if (zI && requireOriginal.getPathSegments().contains("picker")) {
                wVarB = xVar.b(requireOriginal, i10, i, iVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                wVarB = xVar.b(requireOriginal, i10, i, iVar);
            }
        }
        if (wVarB != null) {
            return wVarB.f182c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        e eVar = this.f1393u;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f1392t = true;
        e eVar = this.f1393u;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(f fVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            e eVarB = b();
            if (eVarB == null) {
                dVar.b(new IllegalArgumentException("Failed to build fetcher for: " + this.f1388d));
            } else {
                this.f1393u = eVarB;
                if (this.f1392t) {
                    cancel();
                } else {
                    eVarB.e(fVar, dVar);
                }
            }
        } catch (FileNotFoundException e) {
            dVar.b(e);
        }
    }
}
