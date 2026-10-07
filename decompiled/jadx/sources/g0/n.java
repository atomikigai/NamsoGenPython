package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4149a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f4150b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4151c = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i10, b bVar, boolean z4, boolean z10) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i11 = typedValue.assetCookie;
            r.j jVar = h0.g.f4553b;
            Typeface typeface = (Typeface) jVar.get(h0.g.b(resources, i, string, i11, i10));
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.webkit.b(2, bVar, typeface));
                }
                typefaceA = typeface;
            } else if (!z10) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        e eVarI = b.i(resources.getXml(i), resources);
                        if (eVarI == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typefaceA = h0.g.a(context, eVarI, resources, i, string, typedValue.assetCookie, i10, bVar, z4);
                        }
                    } else {
                        int i12 = typedValue.assetCookie;
                        Typeface typefaceM = h0.g.f4552a.m(context, resources, i, string, i10);
                        if (typefaceM != null) {
                            jVar.put(h0.g.b(resources, i, string, i12, i10), typefaceM);
                        }
                        if (bVar != null) {
                            if (typefaceM != null) {
                                new Handler(Looper.getMainLooper()).post(new androidx.webkit.b(2, bVar, typefaceM));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typefaceA = typefaceM;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                } catch (XmlPullParserException e4) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e4);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typefaceA != null || bVar != null || z10) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
