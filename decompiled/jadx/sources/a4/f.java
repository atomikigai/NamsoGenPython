package a4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f140d;

    public /* synthetic */ f(int i, Comparable comparable, Object obj) {
        this.f137a = i;
        this.f138b = comparable;
        this.f139c = obj;
    }

    public static f b(Context context, Uri uri, v3.b bVar) {
        return new f(2, uri, new v3.c(com.bumptech.glide.b.a(context).f1841c.a().e(), bVar, com.bumptech.glide.b.a(context).f1842d, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f137a) {
            case 0:
                ((h0) this.f139c).getClass();
                return InputStream.class;
            case 1:
                return ((h0) this.f139c).b();
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        switch (this.f137a) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f140d).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.f140d;
                if (obj != null) {
                    try {
                        switch (((h0) this.f139c).f148a) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f140d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f137a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        switch (this.f137a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        Object objOpen;
        switch (this.f137a) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamA = h0.a((String) this.f138b);
                    this.f140d = byteArrayInputStreamA;
                    dVar.f(byteArrayInputStreamA);
                } catch (IllegalArgumentException e) {
                    dVar.b(e);
                }
                break;
            case 1:
                try {
                    h0 h0Var = (h0) this.f139c;
                    File file = (File) this.f138b;
                    switch (h0Var.f148a) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f140d = objOpen;
                    dVar.f(objOpen);
                } catch (FileNotFoundException e4) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e4);
                    }
                    dVar.b(e4);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamI = i();
                    this.f140d = inputStreamI;
                    dVar.f(inputStreamI);
                } catch (FileNotFoundException e10) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
                    }
                    dVar.b(e10);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0028: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:41), block:B:10:0x0028 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    public InputStream i() throws Throwable {
        Cursor cursorA;
        ?? r10;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iO;
        v3.c cVar = (v3.c) this.f139c;
        ContentResolver contentResolver = cVar.f9165c;
        Uri uri = (Uri) this.f138b;
        ?? r11 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorA = cVar.f9163a.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (SecurityException e) {
                        e = e;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iO = n9.b.o(cVar.f9166d, inputStreamOpenInputStream2, cVar.f9164b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        try {
                                            r11.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException | NullPointerException e4) {
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e4);
                                }
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                iO = -1;
                            }
                        } else {
                            iO = -1;
                        }
                        if (iO != -1) {
                            return new com.bumptech.glide.load.data.j(inputStreamOpenInputStream, iO);
                        }
                        return inputStreamOpenInputStream;
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e10) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        iO = n9.b.o(cVar.f9166d, inputStreamOpenInputStream2, cVar.f9164b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iO = -1;
                    }
                    if (iO != -1) {
                        return new com.bumptech.glide.load.data.j(inputStreamOpenInputStream, iO);
                    }
                    return inputStreamOpenInputStream;
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            } catch (Throwable th2) {
                th = th2;
                r11 = r10;
                if (r11 != 0) {
                    r11.close();
                }
                throw th;
            }
        } catch (SecurityException e11) {
            e = e11;
            cursorA = null;
        } catch (Throwable th3) {
            th = th3;
            if (r11 != 0) {
                r11.close();
            }
            throw th;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
            iO = n9.b.o(cVar.f9166d, inputStreamOpenInputStream2, cVar.f9164b);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iO = -1;
        }
        if (iO != -1) {
            return new com.bumptech.glide.load.data.j(inputStreamOpenInputStream, iO);
        }
        return inputStreamOpenInputStream;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
