package rando.cenozocraft.common.datasync;

import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

public class CenozocraftDataSerializers {

    public static final DataSerializer<Optional<UUID>> UUID = new DataSerializer<Optional<UUID>>()
    {
        public void write(PacketBuffer buf, Optional<UUID> value)
        {
            buf.writeBoolean(value.isPresent());

            value.ifPresent(buf::writeUniqueId);
        }
        @Nonnull
        public Optional<UUID> read(PacketBuffer buf) throws IOException
        {
            return !buf.readBoolean() ? Optional.empty() : Optional.of(buf.readUniqueId());
        }
        public DataParameter<Optional<UUID>> createKey(int id)
        {
            return new DataParameter<>(id, this);
        }
        @Nonnull
        public Optional<UUID> copyValue(@Nonnull Optional<UUID> value)
        {
            return value;
        }
    };

    static {
        DataSerializers.registerSerializer(UUID);
    }
}
