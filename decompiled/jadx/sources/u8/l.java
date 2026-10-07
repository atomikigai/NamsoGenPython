package u8;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9037d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f9038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y8.d f9039g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f9034a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8.a f9035b = new n8.a(this, 1);
    public boolean e = true;

    public l(k kVar) {
        this.f9038f = new WeakReference(null);
        this.f9038f = new WeakReference(kVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f9034a;
        this.f9036c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f9037d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(y8.d dVar, Context context) {
        if (this.f9039g != dVar) {
            this.f9039g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f9034a;
                n8.a aVar = this.f9035b;
                dVar.f(context, textPaint, aVar);
                k kVar = (k) this.f9038f.get();
                if (kVar != null) {
                    textPaint.drawableState = kVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.e = true;
            }
            k kVar2 = (k) this.f9038f.get();
            if (kVar2 != null) {
                kVar2.a();
                kVar2.onStateChange(kVar2.getState());
            }
        }
    }
}
