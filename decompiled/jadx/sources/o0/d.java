package o0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f7442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f7443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7445d;

    public d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
        }
        this.f7442a = textPaint;
        this.f7443b = textDirectionHeuristic;
        this.f7444c = i;
        this.f7445d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f7444c != dVar.f7444c || this.f7445d != dVar.f7445d) {
            return false;
        }
        TextPaint textPaint = this.f7442a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = dVar.f7442a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f7443b == dVar.f7443b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f7442a;
        return p0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f7443b, Integer.valueOf(this.f7444c), Integer.valueOf(this.f7445d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f7442a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f7443b);
        sb2.append(", breakStrategy=" + this.f7444c);
        sb2.append(", hyphenationFrequency=" + this.f7445d);
        sb2.append("}");
        return sb2.toString();
    }

    public d(PrecomputedText.Params params) {
        this.f7442a = params.getTextPaint();
        this.f7443b = params.getTextDirection();
        this.f7444c = params.getBreakStrategy();
        this.f7445d = params.getHyphenationFrequency();
    }
}
