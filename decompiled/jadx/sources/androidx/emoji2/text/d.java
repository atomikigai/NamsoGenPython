package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f759b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f760a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f760a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
